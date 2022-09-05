package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = {1000,2000,3000,4000,-100,5000,6000,9999,-200,10000};
		Arrays.sort(numberArray);
		System.out.println(numberArray[0] + "is the min value in array");
		int size= numberArray.length;
		System.out.println(numberArray[size-1] + "is the max value in array");
			

	}

}
