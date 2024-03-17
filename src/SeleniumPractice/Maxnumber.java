package SeleniumPractice;

import java.util.Arrays;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[] abc= {10,70,20,80,700,10000,30}; Arrays.sort(abc);
		 * 
		 * System.out.println("Min No:-"+ abc[0]+ "   "+"Max No:-"+abc[abc.length-1]);
		 */
		
		int[] ab={10,20,30,40};

		for(int i=0;i<ab.length;i++)
		{

		for(int j=1;j<i;j++)
		{

		if(ab[i]>ab[j])
		{

			System.out.println("largest no"+ ab[i]);

	}

		}
		}
	}
}
