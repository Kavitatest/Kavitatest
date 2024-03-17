package SeleniumPractice;

public class OccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="AutomationEvaluation";
		int count=0;
		char ch='a';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+""+count);

	}

}
