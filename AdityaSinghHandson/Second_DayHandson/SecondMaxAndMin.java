package Second_DayHandson;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxAndMin {

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
		Arrays.sort(arr);
		System.out.println("First maximum and Second maximum element of array-->"+arr[size-1]+" "+arr[size-2]);

		System.out.println("First Minmum and Second Minmum element of array-->"+arr[0]+" "+arr[1]);
	sc.close();
	}

}
