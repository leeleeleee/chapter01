package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("Ƚ���� �Է��ϼ��� :");
		int count= scanner.nextInt();
		if(count<0){
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else{
		for(int i =1; i<=count; i++){
			System.out.println("Hello World");
		}
		}
		// Q: �Ʒ� for����  ����Ͽ�  ��Hello World���� �Է� ���� �� ��ŭ ��� �ϼ���.
		scanner.close();
	}

}
