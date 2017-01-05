package chapter01;

public class ArrayTest04 {

	public static void main(String[] args) {
//		Student sl = new Student(); //같은 패키지 안에 student class 있기 때문
		
		
		Student[] students = new Student[3];
		for(Student s : students) {
			System.out.println( s );
		}
		
		//흔히 하는 실수
		//students[0].name = "둘리";
		System.out.println("==================");
		
		students[0] = new Student();
		students[0].name = "둘리";
		
		for (Student s: students){
			if(s!=null){
				System.out.println(s.name);
			}
		}

	}

}
