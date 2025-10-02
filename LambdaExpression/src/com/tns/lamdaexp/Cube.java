package com.tns.lamdaexp;

public class Cube {

    // Functional interface inside Cube.java
    @FunctionalInterface
    interface CalCube {
        int cal(int a);
    }

    public static void main(String[] args) {
        
        // Lambda expression to calculate cube
        CalCube c = (a) -> a * a * a;
        
        System.out.println("Cube of 5: " + c.cal(5));
        System.out.println("Cube of 3: " + c.cal(3));
        System.out.println("Cube of 7: " + c.cal(7));
    }
}
