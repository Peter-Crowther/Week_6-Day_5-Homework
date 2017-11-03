package com.example.petes.raysmusicexchange.RaysMusicShop;

/**
 * Created by petes on 03/11/2017.
 */

public class Trumpet extends Instrument {

    int numberOfValves;

    public Trumpet(String type, String colour, int numberOfValves) {
        super(type, colour);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "Rootatoot";
    }
}
