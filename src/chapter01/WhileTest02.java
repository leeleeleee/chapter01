package chapter01;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		int sum = 0;
		int value = -1;// ù��° ���� ������ ���� -1�� �ʱ�ȭ
		Scanner scanner = new Scanner(System.in);
		while (value != 0) {// �Է°��� 0�� �ƴϸ�
			System.out.print("�����Է�[0 to quit] >");
			value = scanner.nextInt();
			sum += value;
		}

		System.out.println(sum);
	}

}
