package string;

public class Reverse {
	
	public static void main(String[] args) {
		
		String str = "Venkata Krishna Reddy";
		
		//approach1 
		
//		char[] chArr = str.toCharArray();
//		
//		for(int i= chArr.length-1; i>0; i--)
//		{
//			System.out.println(chArr[i]);
//			
//		}
//		System.out.println(" ");
//		
//		// Approach2
		for(int i =str.length()-1; i>0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
		   System.out.println(" ");
		   
////		   approach3 
//		   
//		   StringBuffer  sb= new StringBuffer(str);
//		   
//		   System.out.println(sb.reverse());
//		   System.out.println("Approach 3");
	}
	
}
		
	






	