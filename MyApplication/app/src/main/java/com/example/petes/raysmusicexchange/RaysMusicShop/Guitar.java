package com.example.petes.raysmusicexchange.RaysMusicShop;

/**
 * Created by petes on 03/11/2017.
 */

public class Guitar extends Instrument {

    int numberOfStrings;


    public Guitar(String description, double priceBought, double priceSold, String type, String colour, int numberOfStrings) {
        super(description, priceBought, priceSold, type, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }


    @Override
    public String play() {
        return "Twang";
    }
}
