package chapter01;

public class Swap {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;
		
		int temp = n2;
		n2 = n1;
		n1 = temp;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		if (n1 >= n2) {
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		} else {
			System.out.println("n1: " + n2);
			System.out.println("n2: " + n1);
		}
		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if (a1 >= a3) {
				System.out.println("�ִ밪= " + a1);
			}
		}
		if (a2 >= a1) {
			if (a2 >= a3) {
				System.out.println("�ִ밪= " + a2);
			}
		}
		if (a3 >= a1) {
			if (a3 >= a2) {
				System.out.println("�ִ밪= " + a3);
			}
		}
		int b1 = 3;
		int b2 = 2;
		int b3 = 1;

		if (b1 >= b2) {
			if (b1 >= b3) {
				System.out.println("�ִ밪= " + b1);
			} else {
				System.out.println("�ִ밪= " + b3);
			}
		} else {  //(b2>b1)
			if (b2 >= b3) {
				System.out.println("�ִ밪= " + b2);
			} else {
				System.out.println("�ִ밪= " + b3);
			}

		}
	}
}
