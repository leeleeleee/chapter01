package chapter01;

public class ArrayTest04 {

	public static void main(String[] args) {
//		Student sl = new Student(); //���� ��Ű�� �ȿ� student class �ֱ� ����
		
		
		Student[] students = new Student[3];
		for(Student s : students) {
			System.out.println( s );
		}
		
		//���� �ϴ� �Ǽ�
		//students[0].name = "�Ѹ�";
		System.out.println("==================");
		
		students[0] = new Student();
		students[0].name = "�Ѹ�";
		
		for (Student s: students){
			if(s!=null){
				System.out.println(s.name);
			}
		}

	}

}
