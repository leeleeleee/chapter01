package chapter01;

public class VariableTest {
	int number;

	public void test() {
		int j = number + 10;// �ν��Ͻ� ������ �ʱ�ȭ�� �ȴ�.
	}

	public static void main(String[] args) {
		int i = 10;
		/*
		 * int i =20 ���� ������ �ĺ��ڴ�.
		 */
		// int j =i; // ���� ���������� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.

		boolean isHoliday = false;
		char c = 'A'; // ���� ���ͷ�
		char c1 = 65;// ��(�ƽ�Ű)
		byte b = 10;
		short s = 20;
		int k = 10;
		long l = 123456789;
		float f = 3.14f;
		double d = 3.14;

		System.out.println(isHoliday);
		System.out.println(c);
		System.out.println(c + ":" + c1);
		System.out.println(b);
		System.out.println(s);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		// ���
		final int MAX_SPEED = 20;
		// max_speed = 200; fianl�� ���� ������ ���Ŀ� ������ �� �� ����(���)

		// String ��ü Ȯ��
		String str = new String("Hello");
		System.out.println(str);

		// String��ü�� ���ͷ��� ����ϱ�
		String str1 = "Hello";
		System.out.println(str1);

	}
}
