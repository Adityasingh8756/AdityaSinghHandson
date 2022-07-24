package Second_DayHandson;

import java.util.Scanner;

public class NumberSearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element that you want to search");
		int number=sc.nextInt();
		int flag=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==number)
			{
				flag=1;
				 index=i;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The given number present at index--> "+index+"   ");
		}
			else
			{
				System.out.println("-1");
			}
		sc.close();
	}

}
