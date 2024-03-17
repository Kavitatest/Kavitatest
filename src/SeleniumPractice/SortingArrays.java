package SeleniumPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //Max and Min No int[] ab= {10,378,476,21,3,85,40,2,44,9}; Arrays.sort(ab);
		 * 
		 * System.out.println(ab[0]+"       "+ab[ab.length-1]);
		 */
		
		
		//Sorting of arrays
		
		/*
		 * int[] ab=new int[]{10,3,20,4,2,1,4999,23,100,43};
		 * 
		 * Arrays.sort(ab);
		 * 
		 * for(int i=0;i<ab.length;i++) { System.out.println(ab[i]);
		 * 
		 * }
		 */
		/*
		 * //reverse of the String
		 * 
		 * String str="kavitasriv" , resv="";
		 * 
		 * for(int i=str.length()-1;i>=0;i--) { resv=resv+str.charAt(i); }
		 * 
		 * System.out.println(resv);
		 */
		
		/*//Sorting of arrays descending order
		
				
				  Integer[] ab={10,3,20,4,2,1,4999,23,100,43};
				  
				  Arrays.sort(ab,Collections.reverseOrder());
				  
				  System.out.println(Arrays.toString(ab));
				  
				  }
				 */
		
		//occurance of each character
		
		String str="JavaKavitaTest";
		
		ArrayList<Character> arrlist=new ArrayList<>();
		
		for(int i=0;i<str.length();i++)
		{
			arrlist.add(str.charAt(i));
		}
		
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
		map.putIfAbsent(arrlist.get(i),Collections.frequency(arrlist, arrlist.get(i)));
		}
		
		
		for(Map.Entry<Character,Integer> e : map.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		
		
	}
}


