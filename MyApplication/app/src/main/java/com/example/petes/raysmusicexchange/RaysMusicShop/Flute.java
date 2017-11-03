package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Playable;

/**
 * Created by petes on 03/11/2017.
 */

public class Flute extends Instrument implements Playable {
    int numberOfValves;

    public Flute(String type, String colour, int numberOfValves) {
        super(type, colour);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "Flootytoot!";
    }
}
