package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("횟수를 입력하세요 :");
		int count= scanner.nextInt();
		if(count<0){
			System.out.println("잘못 입력하셨습니다.");
		}else{
		for(int i =1; i<=count; i++){
			System.out.println("Hello World");
		}
		}
		// Q: 아래 for문을  사용하여  “Hello World”를 입력 받은 수 만큼 출력 하세요.
		scanner.close();
	}

}
