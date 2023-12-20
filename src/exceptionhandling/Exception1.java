package exceptionhandling;

public class Exception1 {
	
public static void main(String[] args) {
		
		System.out.println("execution start");
		
		int a = 9;
		int b = 0;
		int result= 0;
		
		try {
		 result = a/b ;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		finally {
			System.out.println("final block");
		}
	 System.out.println(result);{
		 
		 System.out.println("execution end");
	 }
	 
		
	}

}
