package chapter01;

public class TypeCast {
	public static void main(String[] args){ 
		
		// �Ͻ��� (implicity) casting ��->ū
		int i1 = 9999;
		long l1 = i1;//int���� ũ��
		
		//�����(explicity) casting ū->��
		long l2 = 12345678;
		int i2 = (int)l2;//long ���� �۴�
		
		System.out.println(l1 + ":" +i1);
		System.out.println(l2 + ":" +i2);

		
	}
}
