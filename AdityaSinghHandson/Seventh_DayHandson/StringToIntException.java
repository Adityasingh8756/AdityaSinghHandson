package Seventh_DayHandson;

import java.util.Scanner;

public class StringToIntException {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =sc.nextLine();
		try
		{
		int number=Integer.valueOf(str);
		int SquareOfNumber=number*number;
		System.out.println("The Square value is "+SquareOfNumber);
		System.out.println("The work has been done successfully");
		
		}
		catch(Exception e)
		{
			System.out.println("Entered input is not a valid format for an integer."); 
				
		}
		sc.close();
	}

}
