package Second_DayHandson;

import java.util.Scanner;

public class MinMaxOfArray {

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
		int max=arr[0],min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("maximum element of array-->"+max);

		
		
		System.out.println("minmum element of array-->"+min);
	sc.close();
	
	}

}