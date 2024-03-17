package SeleniumPractice;

public class Testdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love Java" , resv="";
		
		String[] abc=reverse(str).split("");
		
		for(int i=0;i<str.length();i++)
		{
			resv+=reverse(abc[i])+"";
		}
		
		System.out.println(resv.trim());

	}



	public  static String reverse(String str) {
		
		String revword="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revword+=str.charAt(i);
		}
		return revword;
	}

}
