package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n1=0;
  int n2 = 1;
  int n3=0;
  System.out.println(0);
  
   for (int i=1;i<=11;i++) {
	   
	   n3= n1+n2;
	   n1=n2;
	   n2=n3;
	   System.out.println(n3);
			   
   }
	}

}
