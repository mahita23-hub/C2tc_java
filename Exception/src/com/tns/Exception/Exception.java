package com.tns.Exception;

public class Exception {
	public static void main(String[] args) {
		int d=0;
		try
		{
			int a=42/d;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handled"+ a.getMessage());
		}
		finally {
			
		}
		System.out.println("Will not be printed");
	}

}
