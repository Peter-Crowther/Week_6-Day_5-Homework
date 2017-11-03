package com.example.petes.raysmusicexchange.RaysMusicShop;

/**
 * Created by petes on 03/11/2017.
 */

abstract public class Instrument {

    private String type;
    private String colour;

    public Instrument() {
        this.type = type();
        this.colour = colour();
    }

}
