package com.collections.removeduplicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesStringUsingjava8 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Avi");
		al.add("Sujit");
		al.add("Avi");
		al.add("Suraj");
		al.add("Ketan");
		al.add("Shailesh");
		al.add("Maddya");
		al.add("Ketan");
		al.add("Avi");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------");
		
		List<String> list=al.stream().distinct().collect(Collectors.toList());

		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext()){
			
			System.out.println(itr1.next());
		}
		
	}
}
