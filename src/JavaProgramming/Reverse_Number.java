package JavaProgramming;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=123456789;
		String str=String.valueOf(no);
		String resv="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			resv=resv+str.charAt(i);
		}
		System.out.println(resv);

	}

}
