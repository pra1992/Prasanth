package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray= {15,10,9,8,7,5,4,2002,21,39,0,88,77,55,76,66,77};
		boolean flag= false;
		
		Arrays.sort(numArray);
		for (int i=0; i<(numArray.length)-1; i++) {
			if(numArray[i]==numArray[i+1]) {
				System.out.println(numArray[i] + "is a duplicate value");
				 flag=true;
			}}
			
		if (flag==false) {
			System.out.println("No Duplicate Values");
		}
	}

}
