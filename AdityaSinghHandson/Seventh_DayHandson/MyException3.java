package Seventh_DayHandson;

public class MyException3 extends Exception
{
MyException3()
{
	System.out.println("MyException");
}
MyException3(String s)
{
	System.out.println("MyException "+ s);
}
}
