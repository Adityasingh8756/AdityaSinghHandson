package Seventh_DayHandson;

import java.util.Scanner;
class UserReg extends MyException2
{
	private String  name;
	private String country; 
	 String str="india";
	
	UserReg(String a,String b) throws MyException2
	{
		this.country=b;
		this.name=a;
		if(this.country.equalsIgnoreCase(str))
		{
			throw new MyException2("User registration done successfully");
		}
		else
		{
			throw new MyException2("User Outside India cannot be registered");
		}
	}
	

}

public class UserRegistation {

	public static void main(String[] args) throws MyException2 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NAme and Country  : ");
		String name=sc.nextLine();
		String Country=sc.nextLine();
		UserReg user=new UserReg(name,Country);
		
		

	}

}
