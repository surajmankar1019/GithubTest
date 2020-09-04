package com.collections.removeduplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingJava8 
{
   public static void main(String[] args) {
	
	  ArrayList<Integer> al=new ArrayList<>();
	  al.add(1);
	  al.add(2);
	  al.add(3);
	  al.add(1);
	  al.add(2);
	  al.add(4);
	  al.add(5);
	  al.add(4);
	  
	  System.out.println(al);
	  
	  List<Integer> removeDupli=al.stream().distinct().collect(Collectors.toList());
	  
	  System.out.println(removeDupli);
	  
	  }
}
