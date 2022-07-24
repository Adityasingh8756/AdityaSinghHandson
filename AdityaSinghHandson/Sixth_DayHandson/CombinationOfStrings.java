package Sixth_DayHandson;

import java.util.Scanner;

public class CombinationOfStrings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1  :");
		String s1=sc.nextLine();
		System.out.println("Enter the String2  :");
		String s2=sc.nextLine();
		String s3="";
		System.out.println(s1);
		System.out.println(s2);
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
			s3=s3+(s1.substring(i,i+1)+s2.substring(i,i+1));
		}
		}
		else
		{
			System.out.println("Length of String are not same.");
		}
		
		System.out.println("output String Is -->"+s3);
		sc.close();
	}

}
