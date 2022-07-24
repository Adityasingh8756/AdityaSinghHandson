package Seventh_DayHandson;

import java.util.Scanner;

class Division
{
private int num1;
private int  num2;

	Division(int a,int b)
	{
		this.num1=a;
		this.num2=b;
	}
	void Calculation()
	{
		try {
		
		float res=num1/num2;
		System.out.println(res);
	}
	catch(Exception e)
	{
		System.out.println(e.fillInStackTrace());
	}
}
}

public  class TestDivision
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numuber : ");
		int n=sc.nextInt();
		System.out.println("Enter the divisior : ");
		int n2=sc.nextInt();
		Division d= new Division(n,n2);
		d.Calculation();
	
		

	}

}

