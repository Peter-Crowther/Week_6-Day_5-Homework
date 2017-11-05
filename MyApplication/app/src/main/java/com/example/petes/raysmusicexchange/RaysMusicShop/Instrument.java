package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Playable;

/**
 * Created by petes on 03/11/2017.
 */

abstract public class Instrument extends ItemsForSale implements Playable {

    protected String type;
    protected String colour;


    public Instrument(String description, double priceBought, double priceSold, String type, String colour) {
        super(description, priceBought, priceSold);
        this.type = type;
        this.colour = colour;
    }


    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }



}
