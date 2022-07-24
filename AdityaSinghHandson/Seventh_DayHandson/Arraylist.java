package Seventh_DayHandson;
import java.util.*;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();

		al.add("january");
		al.add("february");
		al.add("March");
		al.add("april");
		al.add("May");
		al.add("june");
		al.add("july");
		al.add("august");
		al.add("september");
		al.add("october");
		al.add("november");
		al.add("December");
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
