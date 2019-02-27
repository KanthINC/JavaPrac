package in.kanth.lamdas;

import java.util.function.BiConsumer;

public class LamdaExceptionHandle {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		add(a,b,OuterLamda((k,v)-> {
			k=null;
			k.toString();
		}));

	}

	private static void add(int a,int b,BiConsumer<Integer, Integer> con) {
		con.accept(a, b);	
		}

	
	public static BiConsumer<Integer, Integer> OuterLamda(BiConsumer<Integer, Integer> con){
		return (k,v)->{
			try{
				con.accept(k, v);
			}
			catch(Exception e){
				System.out.println("Exception ");
			}
		};
	}
}
