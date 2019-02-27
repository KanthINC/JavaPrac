
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.glassfish.gmbal.Description;

/**
 * 
 * @author ramakanth.b
 *
 */
public class AESEncryption {

	@Description("master key used for encryption")
	private static String masterkey = "aeskey.key";

	@Description("CBC key used for encryption")
	private static String cbckey = "cbc.key";

	@Description(value ="Represents the key path  in linux environment")
	private static String keypathLinux = "//i-admin//product//epayslip//CITITAXENCRIPTION//PDF";
	
	@Description(value ="Represents the pdf file location paths  in linux environment")
	private static String filelocationLinux = "//i-admin//product//epayslip//CITITAXENCRIPTION//PDF";

	private static String keypathWindows = "C:\\From E Drive\\TASKS\\AESTest\\keys\\";
	private static String filelocaitonWindows = "C:\\From E Drive\\TASKS\\AESTest\\source\\";

	public static void main(String[] args) {

		try {
			String path = getKeysValues();
			String sourceFilepath = getSourceFilePath();
			byte[] masterkeydata = Files.readAllBytes(Paths.get(path + masterkey));
			byte[] cbckeydata = Files.readAllBytes(Paths.get(path + cbckey));
			// call this to encrypt the files using AES
			encrypt(sourceFilepath, masterkeydata, cbckeydata);
			
			//call this to decrypt the files using AES
			//decrypt(sourceFilepath, masterkeydata, cbckeydata);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param sourceFilepath
	 * @param masterkeydata
	 * @param cbckeydata
	 * @return
	 */
	public static void encrypt(String sourceFilepath, byte[] masterkeydata, byte[] cbckeydata) {
		try {
			
			
			IvParameterSpec iv = new IvParameterSpec(cbckeydata);

			SecretKeySpec skeySpec = new SecretKeySpec(masterkeydata, "AES");

			File file = new File(sourceFilepath);
			File[] listfile = file.listFiles();

			if (null != listfile) {
				Stream.of(listfile).parallel().filter(s -> s.getName().endsWith(".pdf") || s.getName().endsWith(".PDF"))
						.forEach(expectionsWrapper(s -> {
							enCryptFile(iv, skeySpec, s);
						}));
			}
			System.out.println("END OF ENCRYPTION");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void enCryptFile(IvParameterSpec iv, SecretKeySpec skeySpec, File s) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException, IOException {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");

		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

		System.out.println(s);
		Path filepath = Paths.get(s.toString());
		byte[] encrypted = cipher.doFinal(Files.readAllBytes(filepath));
		OutputStream fos = new FileOutputStream(s + ".encrypted");
		fos.write(encrypted);
		Files.delete(filepath);
		fos.close();
	}

	/**
	 * Decrypting the AES Encrypted files
	 * 
	 * @param sourceFilepath
	 * @param masterkeydata
	 * @param cbckeydata
	 * @return
	 */
	public static void decrypt(String sourceFilepath, byte[] masterkeydata, byte[] cbckeydata) {
		try {

			IvParameterSpec iv = new IvParameterSpec(cbckeydata);

			SecretKeySpec skeySpec = new SecretKeySpec(masterkeydata, "AES");

			File file = new File(sourceFilepath);
			File[] listfile = file.listFiles();

			if (null != listfile) {
				Stream.of(listfile)
				.parallel()
				.filter(s -> s.getName().endsWith(".encrypted"))
						.forEach(expectionsWrapper(s -> {
							decryptFIle(iv, skeySpec, s);
						}));
			}
			System.out.println("END OF DECRYPTION");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void decryptFIle(IvParameterSpec iv, SecretKeySpec skeySpec, File s) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException, IOException{
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");

		cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
		System.out.println(s);
		Path filepath = Paths.get(s.toString());
		byte[] encrypted = cipher.doFinal(Files.readAllBytes(filepath));
		OutputStream fos = new FileOutputStream(s.toString().replaceAll(".encrypted", ""));
		fos.write(encrypted);
		Files.delete(filepath);
		fos.close();
	}

	/**
	 * Keys are present in the below mentioned location
	 * 
	 * @return
	 */

	private static String getKeysValues() {
		String osName = java.lang.System.getProperty("os.name");
		if (osName.indexOf("Windows") >= 0) {
			return keypathWindows;
		} else {
			return keypathLinux;
		}

	}

	/**
	 * The files which we want to decrypt are placed in the below mentioned
	 * location
	 * 
	 * @return
	 */
	private static String getSourceFilePath() {
		String osName = java.lang.System.getProperty("os.name");
		if (osName.indexOf("Windows") >= 0) {
			return filelocaitonWindows;
		} else {
			return filelocationLinux;
		}

	}
	
	static <T> Consumer<T> expectionsWrapper(
			  HandleExceptions<T, Exception> throwingConsumer) {
			  
			    return s -> {
			        try {
			            throwingConsumer.accept(s);
			        } catch (Exception ex) {
			            throw new RuntimeException(ex);
			        }
			    };
			}
	
	
	@FunctionalInterface
	public interface HandleExceptions<T, E extends Exception> {
	    void accept(T t) throws E;
	}
}
