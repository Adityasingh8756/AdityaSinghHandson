package Fourth_DayHandson;

import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String 1 ");
	String str1=sc.nextLine();
	System.out.println("Enter the String 2 ");
	String str2=sc.nextLine();
	String str3="";
	char ch1=str1.charAt(str1.length()-1);
	char ch2=str2.charAt(0);
	String str4=str2.substring(1, str2.length());

	if (ch1==ch2)
	{
		str3=str1.concat(str4);
		System.out.println("String 1 and String 2 concatenation is-->"+str3.toLowerCase());
	}
	else
	{
		str3=str1.concat(str2);
	System.out.println("String 1 and String 2 concatenation is-->"+str3.toLowerCase());
	
	}sc.close();
	}
	

}
