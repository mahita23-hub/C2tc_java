package com.tns.genrics;

public class GenricMethod {
    public <T> void displayArrayElements(T[] elements) { // generic method
        for (T ele : elements) {
            System.out.println("elements is " + ele);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GenricMethod obj = new GenricMethod();

        Integer[] intArray = {10, 20, 30};
        String[] strArray = {"hello", "hai"};

        obj.displayArrayElements(intArray);
        obj.displayArrayElements(strArray);
    }
}
