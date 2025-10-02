package com.tns.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>country = Arrays.asList("Gangavathi", "Bengaluru", "Mumbai");
		
		List<String>up=country.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(up);
		
		List<Integer>even=Arrays.asList(1,2,3,4,5,6);
		List<Integer> li = even.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(li);
	}

}
