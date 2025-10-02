package com.tns.genrics;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenricProgram <String> obj=new GenricProgram();
		obj.setData("Hello");
		System.out.println("The string obj is " +obj.getData());

		GenricProgram <String> iobj=new GenricProgram();
		iobj.setData("22");
		System.out.println("The string obj is " +iobj.getData());
	}

}
