package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Playable;
import com.example.petes.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by petes on 03/11/2017.
 */

public class Trumpet extends Instrument {

    int numberOfValves;


    public Trumpet(String description, double priceBought, double priceSold, String type, String colour, int numberOfValves) {
        super(description, priceBought, priceSold, type, colour);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    @Override
    public String play() {
        return "Rootatoot";
    }

}
