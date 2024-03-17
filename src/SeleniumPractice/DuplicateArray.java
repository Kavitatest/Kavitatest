package SeleniumPractice;

import java.util.LinkedHashSet;

public class DuplicateArray {
	
	//remove duplicate
	
	public static void duplicate(int[] abc)
	{
		LinkedHashSet<Integer> hasp=new LinkedHashSet<Integer>();
		for(int i=0;i<abc.length;i++)
		{
			hasp.add(abc[i]);
		}
		
		System.out.println(hasp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] abc= {1,2,2,3,4,4,4,5,5};
		
		duplicate(abc);
		

	}

}
