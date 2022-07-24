package Fourth_DayHandson;

import java.util.Scanner;

public class ShortLongShort {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String 1 ");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2 ");
		String str2=sc.nextLine();
		
		if(str1.length()>str2.length())
		{
			System.out.println(str2+str1+str2);
		}
		else
		{
			System.out.println(str1+str2+str1);
		}
		sc.close();
		

	}

}
