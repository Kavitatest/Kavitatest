package JavaProgramming;

import java.util.Arrays;

public class MaxandMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {1,25,10,32,2,45,10};
		Arrays.sort(number);
		
		System.out.println("Min"+"   "+number[0]+" "+"Max"+"   "+number[number.length-1]);

	}

}
