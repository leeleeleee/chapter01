package chapter01;

public class TypeCast {
	public static void main(String[] args){ 
		
		// 암시적 (implicity) casting 작->큰
		int i1 = 9999;
		long l1 = i1;//int보다 크다
		
		//명시적(explicity) casting 큰->작
		long l2 = 12345678;
		int i2 = (int)l2;//long 보다 작다
		
		System.out.println(l1 + ":" +i1);
		System.out.println(l2 + ":" +i2);

		
	}
}
