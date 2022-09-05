package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Accenture";
		char word ='c';
		boolean flag=false;
		
	char[] nameArray=	name.toCharArray();
	int count=0;
	for(int i=0; i<nameArray.length;i++) {
		if(nameArray[i]==word) {
			count++;
			flag=true;
		
		}
	}
	if(flag==true)
	System.out.println("count of letter is " +    count);
	else
		System.out.println("letter is not present");
		  
}}
