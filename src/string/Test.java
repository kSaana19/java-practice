package string;

public class Test {

	public static void main(String[] args) {
		
		String S1 = "Hello";
		String S2 = new String("Hello");
		String S3 = "Hello";
//		System.out.println(S1==S2);
//		System.out.println(S2==S3);
//		System.out.println(S1==S3);
		
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S2));
		

	}

}
