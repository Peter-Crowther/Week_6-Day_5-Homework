package com.example.petes.raysmusicexchange.RaysMusicShop;


/**
 * Created by petes on 03/11/2017.
 */

public class Flute extends Instrument {

    int numberOfKeyHoles;


    public Flute(String description, double priceBought, double priceSold, String type, String colour, int numberOfKeyHoles) {
        super(description, priceBought, priceSold, type, colour);
        this.numberOfKeyHoles = numberOfKeyHoles;
    }


    public int getNumberOfKeyHoles() {
        return this.numberOfKeyHoles;
    }



    @Override
    public String play() {
        return "Flootytoot!";
    }
}
