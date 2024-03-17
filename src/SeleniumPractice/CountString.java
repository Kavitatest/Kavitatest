package SeleniumPractice;

import java.util.HashMap;
import java.util.Map;

public class CountString {

	public static void main(String[] args) {
		
		String str="Hello World" ,resv="";
		for(int i=str.length()-1;i>=0;i--)
		{
			resv=resv+str.charAt(i);
			
			
		}
		System.out.println(resv);
		
		Map<String,Integer> sp=new HashMap<>();
		String[] ab=str.split("");
		for(String word:ab)
		{
			if(sp.containsKey(word))
					{
				sp.put(word, sp.get(word)+1);
				
					}
			else
			{
				sp.put(word, 1);
			}
		}
		
		System.out.println(sp);
		
		
		

	}

}
