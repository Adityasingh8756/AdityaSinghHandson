package Second_DayHandson;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		System.out.println("Enter the Choice --> 1 for loop and 2 for whlie loop");
		int choice = sc.nextInt();
		int k=0,l=0;
		switch(choice)
		{
		case 1:
		for(int i=0;i<=num;i++)
		{
			System.out.println();
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("*  ");
				}
			}
		}
		break;
		case 2:
			while( k<=num)
			{
				System.out.println();
				l=0;
				while(l<k)
				{
					System.out.print("*  ");
					l++;
				}
				k++;
			}
			break;
			default:
				System.out.println("Invalid input");
				break;
		}
		sc.close();
	}

}