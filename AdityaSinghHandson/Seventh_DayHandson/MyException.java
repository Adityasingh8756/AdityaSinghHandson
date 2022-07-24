package Seventh_DayHandson;

public class MyException extends Exception
{
	MyException()
	{
		System.out.println("Myexception");
	}
	MyException(String s)
	{
		System.out.println("Myexception"+s);
	}
	
}
