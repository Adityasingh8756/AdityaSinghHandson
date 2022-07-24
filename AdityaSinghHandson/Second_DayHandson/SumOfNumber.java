package Second_DayHandson;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String fgjh[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		int rem=0;
		while(number>0)
		{
			rem=number%10;
			sum = sum +rem;
			number=number/10;
		}
		System.out.println("sum of number   "+sum);
		sc.close();
	}
}
