package Seventh_DayHandson;

import java.util.Scanner;

public class StudentAvgException {

	public static void main(String[] args)  throws MyException
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Name of First Student :");
		String Name1=sc.nextLine();
		
			System.out.println("Enter the Name of second Student :");
		
		String Name2=sc.nextLine();
		
		
		
		System.out.println("Enter the Marks of First Student :");
		int Marks1[]=new int[3];
		for(int i=0;i<Marks1.length;i++)
		{
			

			Marks1[i]=sc.nextInt();
			if(Marks1[i]<0)
			{
			throw new MyException("you should not pass negative Marks ");
			}
			if(Marks1[i]>100)
			{
				throw new MyException("you should not enter Marks greter then 100 ");
			}
		}
		
		
		System.out.println("Enter the Marks of second Student :");
		int Marks2[]=new int[3];
		for(int i=0;i<Marks1.length;i++)
		{
			
			Marks2[i]=sc.nextInt();
			if(Marks2[i]<0)
			{
			throw new MyException("you should not pass negative Marks ");
			}
			if(Marks2[i]>100)
			{
				throw new MyException("you should not enter Marks greter then 100 ");
			}
			}
		int sum1=0;
		for(int i=0;i<Marks1.length;i++)
		{
			sum1=sum1+Marks1[i];
		}
		int sum2=0;
		for(int i=0;i<Marks1.length;i++)
		{
			sum2=sum2+Marks2[i];
			
		}
		float avg1=sum1/Marks1.length;
		float avg2=sum2/Marks1.length;
		
		System.out.println(Name1+" Average Marks  : "+avg1);
		  
		System.out.println(Name2+" Average Marks  : "+avg2);
		
		}
	}


