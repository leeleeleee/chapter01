package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int value=0;
		Scanner scanner = new Scanner(System.in);
		do {
				System.out.print( "숫자입력[0 to quit] >" );
				value = scanner.nextInt();
				sum+=value;
		}while(value != 0);

		System.out.println(sum);
	}

}
