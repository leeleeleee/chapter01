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
		System.out.print("�¼�: ");

		int pow = scanner.nextInt();
		int i = 0;
		// Q: �Ʒ� while �ݺ����� �ۼ��Ͻÿ�.
		while (i < pow) {
			result = result * 2;
			i++;
		}
		scanner.close();
		System.out.println("2�� " + pow + "������ " + result + "�Դϴ�.");

	}

}
