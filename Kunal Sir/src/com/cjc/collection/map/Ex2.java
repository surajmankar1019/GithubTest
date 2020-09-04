package com.cjc.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<>();
		m.put("Suraj", "Java");
		m.put("Avi", "C++");
		m.put("Amit", "Oracle");
		m.put("Roshan", "Python");
		
		System.out.println(m);
		
		m.put("Roshan", "CJC");
		System.out.println(m);
		
		String val=m.get("Suraj");
		System.out.println(val);
		Set<String> keys=m.keySet();
		System.out.println(keys);
		
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println(key);
			
			String val1=m.get(key);
			System.out.println(val1);
		}
	}
}
