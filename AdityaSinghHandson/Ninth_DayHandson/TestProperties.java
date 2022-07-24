package Ninth_DayHandson;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) {
		Properties p =new Properties();
		p.setProperty("Up", "Lucknow");
		p.setProperty("Bihar","Patna");
		p.setProperty("Mp","Bhopal");
		p.put("hello","byy");		
		Set<Entry<Object,Object>> p1=p.entrySet();
		Iterator<Entry<Object, Object>> it=p1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
