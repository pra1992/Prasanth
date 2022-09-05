package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String reverseString = "Prasanth";
      char[]  stringCharArray= reverseString.toCharArray();
      
      for (int i=(stringCharArray.length)-1; i>=0;i--) {
    	  System.out.println(stringCharArray[i]);
      }
        
	}

}
