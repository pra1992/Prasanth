package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String value1 = "prasanth";
		String value2="";
		for(int i=value1.length()-1;i>=0;i--) {
		 value2= value2+value1.charAt(i);
		}
		if(value2.equals(value1))
			System.out.println("It is a palindrome");
		else
			System.out.println("Not a Palindrome");
				
	}
	}
	 
		 
	 

	


