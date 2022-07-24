package Sixth_DayHandson;

import java.util.Scanner;

public class NtimeNchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1  :");
		String s1=sc.nextLine();
		System.out.println("enter the number : ");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.print("Output : "+s1.substring(+number-1, s1.length()));
		}
		sc.close();
	}

}
