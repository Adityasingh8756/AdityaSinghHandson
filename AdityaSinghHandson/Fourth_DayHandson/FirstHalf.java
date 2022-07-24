package Fourth_DayHandson;

import java.util.Scanner;

public class FirstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  the String ");
		
		String str= sc.nextLine();
		
		String substr2="";
		int n=str.length();
		if(n%2==0)
		{
		for(int i=0;i<str.length()/2;i++)
			substr2=substr2+str.charAt(i);
		System.out.print("First Half of string==");
		
			System.out.print(substr2+"    ");
		}
		else
		{
			System.out.println("null");
		
	}
		sc.close();

}
	
}
