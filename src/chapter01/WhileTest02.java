package chapter01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		int sum = 0;
		int value = -1;// 첫번째 루프 진입을 위해 -1로 초기화
		Scanner scanner = new Scanner(System.in);
		while (value != 0) {// 입력값이 0이 아니면
			System.out.print("숫자입력[0 to quit] >");
			value = scanner.nextInt();
			sum += value;
		}

		System.out.println(sum);
	}

}
