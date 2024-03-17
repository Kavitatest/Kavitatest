package JavaProgramming;

import java.util.LinkedHashSet;

public class RemoveDuplicateNumber {
	
	public static void removeduplicatearrays(int[] num)
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0;i<num.length;i++)
		{
		
		set.add(num[i]);
		
		}
		
		System.out.println(set);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,276,479,1122};
		
		removeduplicatearrays(number);
		

	}

}
