package chapter01;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		// ��Ģ

		a = a + 2;
		System.out.println(a);

		a += 1;
		System.out.println(a);

		a++;
		System.out.println(a);

		++a;
		System.out.println(a);
		/*
		 * ���ϱ�
		 */
		a = a - 1;// a--
		System.out.println(a);

		--a;// a-=1
		System.out.println(a);
		a = a - 1;// a--
		System.out.println(a++);
		System.out.println(a);

		// ������
		System.out.println(10 / 3); // �ΰ��� int�� �� ��Ģ���� ����� int
		System.out.println(10. / 3.); // �ΰ��� double���� ��Ģ���� ����� double
		System.out.println(10. / 3); // int����double���� ��Ģ���� ����� double

		System.out.println((double) 10 / 3);
		System.out.println((double) (10 / 3)); // ����

		// ������
		System.out.println(44 % 3);

		System.out.println(-79 % 38);
		System.out.println(78 % -31);
		System.out.println(-76%-37);
		



	}

}
