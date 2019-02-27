package in.kanth.logics;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class GenerateAnagrams {

	Set<String> result = new LinkedHashSet<>();
	int count=0;
	public static void main(String[] args) {

		GenerateAnagrams obj=new GenerateAnagrams();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Kindly enter any word for angarams with unique charcters");
			String source = sc.next();

			for (int i = 0; i < source.length(); i++) {

				String first = source.substring(i, i+1);
                String iterate=source.replace(first,"");
                obj.formString(iterate,first+iterate,first);
			}

			if (obj.result.size() == getFactorialValue(source.length())) {
				System.out.println(" The output is correct");
			} 
				System.out.println(obj.count);
			

		} catch (Exception e) {
			System.err.println("Error in creating the anagrams");
			e.printStackTrace();
		}

	}

	public  void formString(String source,String maintain,String first){

		for(int i=0;i<source.length()&&source.length()>1;i++){
			if(source.length()==2){
				
				System.out.println(maintain.substring(0, maintain.length()-2)+source);
				System.out.println(maintain.substring(0, maintain.length()-2)+new StringBuilder(source).reverse().toString());
				count=count+2;
				return;
			}
			String src=source.substring(i, i+1);
			String temp=source.replace(src, "");
			maintain=first+src+temp;
			
			/*if(temp.length()==2){
				System.out.println(maintain.substring(0, maintain.length()-2)+source);
				System.out.println(maintain.substring(0, maintain.length()-2)+new StringBuilder(source).reverse().toString());
			
				
			}*/
			if(temp.length()<=1)
				return;
			
			formString(temp,maintain,first);
		}
		
		
	}
	
	
	public static int getFactorialValue(int num) {

		int result = 1;
		for (int i = 1; i < num; i++) {
			result = result * i;
		}
		return result;
	}

}
