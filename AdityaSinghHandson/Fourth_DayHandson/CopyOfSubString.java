package Fourth_DayHandson;

import java.util.Scanner;

public class CopyOfSubString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  the String ");
		
		String str= sc.nextLine();
		
		String substr2="";
		//String k="";
	//	k=str.substring(0, 2);
		for(int i=0;i<2;i++)
			substr2=substr2+str.charAt(i);
		System.out.print("Copies of first two character==");
		for(int i=0;i<str.length();i++)
			System.out.print(substr2+"    ");
		sc.close();
	}
}
