package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "changeme" ;
		char[] charArray= name.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			System.out.println(charArray[i]);
		}
		
	
}}
