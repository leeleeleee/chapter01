package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {

		int i = 1;//�������� ��
		while ( i<=9 ) {
			//���� ����
			System.out.println("========" + i + "��=========");
			int j = 1;//���ϴ� ��
			while( j<=9 ){
				System.out.println( i + "x" + j + "=" + (i*j));
				j++;
			}
			i++;
			
		}
	}

}
