package Second_DayHandson;

import java.util.Scanner;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum =0;
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Arrays Elements-->"+sum);
		System.out.println("Averge of the array-->"+(sum/size));
			 
sc.close();
	}

}
