package com.tns.interfaces;

public interface Amazon {
	int serviceCharge=100;//static final variable
	void addcharge();//abstract  method
	default void display() {
		System.out.println("welcome");
	}
	

}