package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Playable;
import com.example.petes.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by petes on 03/11/2017.
 */

public class Trumpet extends Instrument implements Playable {

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
