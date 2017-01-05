package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner( System.in );
		//
		// System.out.print( "count: " );
		// int count = scanner.nextInt();
		//
		// int i=0;
		// while (i<count){
		// System.out.println("("+ i +") Hello World" );
		// i++;
		// }
		// System.out.println( count );
		//
		//
		Scanner scanner = new Scanner(System.in);
		float result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();
		int i = 0;
		// Q: 아래 while 반복문을 작성하시오.
		while (i < pow) {
			result = result * 2;
			i++;
		}
		scanner.close();
		System.out.println("2의 " + pow + "제곱은 " + result + "입니다.");

	}

}
