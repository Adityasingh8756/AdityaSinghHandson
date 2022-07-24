package Second_DayHandson;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int temp=sc.nextInt();
		int number=temp;
		int res=0;
		int rem=0;
		while(number>0)
		{
			rem=number%10;
			res= res*10 +rem;
			number=number/10;
		}
		//System.out.println("reverse of number   "+res);
		
		if(res==temp)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
			sc.close();
	}

}
