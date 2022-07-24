package Seventh_DayHandson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array : ");
		int size= sc.nextInt();
		System.out.println("Enter the index of the array element you want to access");
		int indexForsearch=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array ");
		try
		{
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			int numberAtindex=arr[indexForsearch];
			System.out.println("The array element at index "+indexForsearch+" : "+numberAtindex);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.fillInStackTrace());
		}
//		catch(NumberFormatException ea)
//		{
//			System.out.println(ea.fillInStackTrace());
//		}
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}

		sc.close();

	}

}
