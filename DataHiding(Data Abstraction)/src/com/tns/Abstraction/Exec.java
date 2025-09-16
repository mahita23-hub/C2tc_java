package com.tns.Abstraction;

public class Exec {
    public static void main(String[] args) {
        Abstraction d;

        // Using Square
        d = new Square(2.0f); // side = 2
        System.out.println("Calculating area for Square:");
        d.calculate();
        d.display();

        System.out.println();

        // Using Circle
        d = new Circle(1.0f); // radius = 1
        System.out.println("Calculating area for Circle:");
        d.calculate();
        d.display();
    }
}
