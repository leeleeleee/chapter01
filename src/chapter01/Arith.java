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
		// 사칙

		a = a + 2;
		System.out.println(a);

		a += 1;
		System.out.println(a);

		a++;
		System.out.println(a);

		++a;
		System.out.println(a);
		/*
		 * 더하기
		 */
		a = a - 1;// a--
		System.out.println(a);

		--a;// a-=1
		System.out.println(a);
		a = a - 1;// a--
		System.out.println(a++);
		System.out.println(a);

		// 나누기
		System.out.println(10 / 3); // 두개의 int형 의 사칙연산 결과는 int
		System.out.println(10. / 3.); // 두개의 double형의 사칙연산 결과는 double
		System.out.println(10. / 3); // int형과double형의 사칙연산 결과는 double

		System.out.println((double) 10 / 3);
		System.out.println((double) (10 / 3)); // 주의

		// 나머지
		System.out.println(44 % 3);

		System.out.println(-79 % 38);
		System.out.println(78 % -31);
		System.out.println(-76%-37);
		



	}

}
