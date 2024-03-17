package JavaProgramming;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JavaAutomationtesting" , resv="";
		for(int i=str.length()-1;i>=0;i--)
		{
			resv=resv+str.charAt(i);
			
		}
		System.out.println(resv);

	}

}
