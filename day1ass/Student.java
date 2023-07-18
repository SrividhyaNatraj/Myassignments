package week1.day1ass;

public class Student {
	public void studentName(String name) {
		System.out.println("Student name:"+name);

	}

	public void rollNo(long rollno) {
		
		System.out.println("Roll no:"+rollno);
	}
	public void collegeName(String name) {
		System.out.println("College name:"+name);
		
	}
	public void marksscored(int marks) {
		
		System.out.println("Marks scored:"+marks);
	}
public void cgpa(float cgpa) {
	
	System.out.println("CGPA:"+cgpa);
}
	public static void main(String[] args) {
		Student s=new Student();
		
		s.studentName("srividhya");
		s.rollNo(1100440020);
		s.collegeName("Anna university");
		s.marksscored(80);
		s.cgpa(8.0f);

	}

}


