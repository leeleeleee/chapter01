package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {

		int i = 1;//곱해지는 수
		while ( i<=9 ) {
			//단이 시작
			System.out.println("========" + i + "단=========");
			int j = 1;//곱하는 수
			while( j<=9 ){
				System.out.println( i + "x" + j + "=" + (i*j));
				j++;
			}
			i++;
			
		}
	}

}
