package chapter01;

public class Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println(a > b && a < b);
		System.out.println(a > b || a < b);
		System.out.println(!(a>b));

		boolean x = (7 == 9);
		System.out.println(x);

	}

}
