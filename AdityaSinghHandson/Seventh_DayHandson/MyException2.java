package Seventh_DayHandson;

public class MyException2 extends Exception
{
MyException2()
{
	System.out.println("MyException");
}
MyException2(String s)
{
	System.out.println("MyException "+ s);
}
}
