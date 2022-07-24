package Eighth_DayHandson;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistNumber {

	public static void main(String[] args) throws Exception
	{
	
 ArrayList <Object>al = new ArrayList();
 try
 {
	 
 Scanner sc = new Scanner(System.in);
 System.out.println("Entre number");
 int i=sc.nextInt();
 float f=sc.nextFloat();
 double d=sc.nextDouble();
 al.add(i);
 al.add(f);
 al.add(d);
 //al.add();
 //al.add("aditya");
 }
 catch(Exception e)
 {
	 throw new Myexception("String not allowed");
 }
 System.out.println(al);

	}

}
