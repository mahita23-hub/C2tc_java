package com.tns.interfaces;

public class PrimeUser implements Amazon {

    @Override
    public void addcharge() {
        System.out.println("No service charge for Prime members.");
    }
}