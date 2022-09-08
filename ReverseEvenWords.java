package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
	String[] test1=	test.split(" ");
	for(int i=0;i<test1.length-1;i++) {
		if(i%2!=0) {
			char[] charTest=test1[i].toCharArray();
			for(int j=charTest.length-1;j>=0;j--) {
				char reverseString= charTest[j];
				System.out.print(charTest[j]+" ");
			}
		}
		else {
			test1[i].toCharArray();
			
		}
	}
	
		
}}
