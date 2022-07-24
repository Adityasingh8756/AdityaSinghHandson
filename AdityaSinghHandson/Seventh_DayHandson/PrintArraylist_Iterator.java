package Seventh_DayHandson;
import java.util.*;
import java.util.ArrayList;

public class PrintArraylist_Iterator 

{
	public static void main(String args[])
	{
		
	ArrayList<String> ia=new ArrayList<String>();
	ia.add("hy");
	ia.add("i");
	ia.add("am");
	ia.add("aditya");
	printall(ia);
	}
	 static void printall(ArrayList<String> list) {
	
	 Iterator it=list.iterator();
	 while(it.hasNext())
	 {
		 Object a=it.next();
		 System.out.print(a+" ");
	 }
	
	}

}
