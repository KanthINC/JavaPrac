package in.kanth.Strings;
/**
 * 
 * @author ramak
 *
 */
public class StringTest1 {
	


	public static void main(String[] args) {
		String s1="tomcat10";
		String s3="10";
        String s2="tomcat"+s3;
     
       if(s1==s2){
    	   System.out.println(true);
       }else{
    	   System.out.println(false);
       }
       
       
       
       String s4="tomcat"+"10";
       if(s1==s4){
    	   System.out.println(true);
       }else{
    	   System.out.println(false);
       }
	}

}
