package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 4;

		if (year % 4 == 0) { // 4�� ������ ����
			if (year % 100 == 0) { // 100���� ������ ����
				if (year % 400 == 0) {// 400���� ����������
					System.out.println("�����Դϴ�.");
				} else {// 400���� ������ ���� ������
					System.out.println("������ �ƴմϴ�.");
				}
			} else {// 100���� ������ ���� ������
				System.out.println("�����Դϴ�.");
			}
		} else { // 4�� ������ ���� ������
			System.out.println("������ �ƴմϴ�.");
		}

		if (year % 4 != 0) {
			System.out.println("������ �ƴմϴ�.");
		} else if (year % 100 != 0) {
			System.out.println("�����Դϴ�.");
		} else if (year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		}

	}

}
