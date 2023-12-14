package pack.java;

public class Student {
	
	String name;
	int rollno ;
	Student(String name,int roiino){
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String [] args) {
		
		Student S1 = new Student("vamsi", 101);
		Student S2 = new Student("krishna", 102);
		
		System.out.println(S1);
		System.out.println(S1.toString());
		System.out.println(S2);
		
	}
	
}
