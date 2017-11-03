package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Playable;

/**
 * Created by petes on 03/11/2017.
 */

abstract public class Instrument implements Playable {

    protected String type;
    protected String colour;

    public Instrument(String type, String colour) {
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
