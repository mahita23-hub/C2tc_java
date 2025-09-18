package com.tns.collections;

import java.util.ArrayList;
import java.util.List;

public final class ListDemo {
	public static void main(String[] args) {
		List<Object> ob=new ArrayList<>();
		ob.add(4);
		ob.add(6);
		ob.add("abc");
		ob.add(13.65f);
		ob.add(14);
		ob.add(null);
		
	
		System.out.println(ob);
		
		boolean c=ob.contains(4);
		System.out.println(c);
		
		
		ob.remove(2);
		System.out.println(ob);
		
		System.out.println(ob.isEmpty());
		
		System.out.println(ob.size());
		
	}

}
