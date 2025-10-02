package com.tns.lamdaexp;

@FunctionalInterface
interface Display {
    void show(String msg);  // single abstract method with parameter
}

public class ParameterDemo {
    public static void main(String[] args) {
        
        // Lambda with parameter
        Display printer = (msg) -> System.out.println("Message: " + msg);
        
        // Calling lambda
        printer.show("Hello ");
        printer.show("Well Come to Lambda Expression");
    }
}
