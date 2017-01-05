package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		while (true){
		System.out.print( "값을 입력하세여 :" );
		int count = scanner.nextInt();
		if(count==0){break;}
		int sum=0;
		for( int i =1; i<=count; i++ ) {
			sum = sum + i;
		}
		System.out.println(sum);
		}
		scanner.close();
		
	}

}
