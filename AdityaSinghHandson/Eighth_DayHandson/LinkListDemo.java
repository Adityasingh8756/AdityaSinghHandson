package Eighth_DayHandson;
import java.util.*;
public class LinkListDemo {
 public static void main (String args[])
 {
	 LinkedList<String> all=new LinkedList<>();
		all.add("january");
		all.add("february");
		all.add("March");
		all.add("april");
		all.add("May");
		all.add("june");
		all.add("july");
		all.add("august");
		all.add("september");
		all.add("october");
		all.add("november");
		all.add("December");
		System.out.println(all);
		for(int i=0;i<all.size();i++)
			System.out.println(all.get(i));
 }
}
