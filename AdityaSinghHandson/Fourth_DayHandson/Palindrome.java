package Fourth_DayHandson;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String rev="";
		String name = sc.nextLine();
		System.out.println("name =="+name);
		System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			 rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(name))
		{
			System.out.println("STring is palindrome");
		}
		else 
		{
			System.out.println("string is not palindrome");
		}
	sc.close();	
	}
	

}
