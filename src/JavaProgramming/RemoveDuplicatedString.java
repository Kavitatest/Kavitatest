package JavaProgramming;

import java.util.LinkedHashSet;

public class RemoveDuplicatedString {
	
	public static void Removeduplicate(char[] cha, int len)
	{
		LinkedHashSet<Character> sb=new LinkedHashSet();
		
		for(int i=0;i<len;i++)
		{
			sb.add(cha[i]);
		}
		
		//System.out.println(sb);
		
		 for(Character ch : sb)   
	            System.out.print(ch);   
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JavaProgramming";
		
		
		char[] ch=str.toCharArray();
		
		int length=str.length();
		
		Removeduplicate(ch,length);

	}

}
