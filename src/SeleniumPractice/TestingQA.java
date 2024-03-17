package SeleniumPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TestingQA {
	
	//Remove duplicate Character
	
	
	/*
	 * public static void removeduplicate(char[] ch, int len) { int index=0; for(int
	 * i=0;i<len;i++) { int j; for(j=0;j<i;j++) { if(ch[i]==ch[j]) { break; } }
	 * 
	 * if(j==i) { ch[index++]=ch[i]; } }
	 * 
	 * System.out.println(String.valueOf(Arrays.copyOf(ch, index))); }
	 */
	
	public static void removeduplicate(String str)
	{
		LinkedHashSet<Character> ch=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
		ch.add(str.charAt(i));
		}
		
		for(Character set:ch)
		{
			System.out.println(set);
		}
	}
	  
	  
	  public static void main(String[] args) {
	  
	  
			/*
			 * String str="JavaProgramming";
			 * 
			 * char[] ch=str.toCharArray();
			 * 
			 * int len=ch.length;
			 * 
			 * removeduplicate(ch,len);
			 */
		  
		  
		  String str="Java programming";
		  
		  removeduplicate(str);
		  
	  
	  }

}
