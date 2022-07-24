package Ninth_DayHandson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapCollection { 
	HashMap<String, String> h1 = new HashMap<>();
	
	public void addName(String name, String name2)
	{
		h1.put(name, name2);
	}
		
	public String CheakName(String name) 
	{
		Set<Entry<String, String>> set = h1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals(name)) {
				
				return "Present in Map";
			}
			
		}
		
		return "Not Present in map";
	}
	
	public String CheakSurName(String name2) {
		Set<Entry<String, String>> set = h1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(name2)) {
				
				return "Present in Map";
			}
			
		}
		
		return "Not Present in map";
	}
	public void ShowHash() {
		Set<Entry<String, String>> set = h1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
		}

	}
}