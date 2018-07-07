package in.kanth.Test;

public class ArrayIterate {

	public static void main(String[] args) {
		String arr="pwwwrrwhwwwrrwwwwwrrwwwwwrrwpww";
		 char[] dayArr =arr.toCharArray();
     
		 double count=0.0;
		 for(char day:dayArr){
			 if(day=='w'){
				 count=count+1;
			 }else if(day=='h'){
				 count=count+0.5;
			 }
		 }
		 System.out.println(count);
	}

}
