package chapter01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ(���ͷ� ����)
		int[] a = { 10, 20, 30, 40 }; //��õ
		int[] b = new int[] { 10, 20, 30, 40 }; //����õ
		
//		int[] a = new int[4];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
		
		for(int i = 0; i < a.length; i++){
		System.out.println(a[i]);
		}
		for(int value : a){
			System.out.println(value*10);
			
			//����
//			int[] c;
//			c = { 10, 20, 30, 40 };
		}
	}

}
