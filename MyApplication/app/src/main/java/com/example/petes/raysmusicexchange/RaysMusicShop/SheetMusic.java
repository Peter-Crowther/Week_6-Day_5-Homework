package com.example.petes.raysmusicexchange.RaysMusicShop;

/**
 * Created by petes on 03/11/2017.
 */

public class SheetMusic extends Items {
    String name;


    public SheetMusic(String description, double priceBought, double priceSold, String type, String name) {
        super(description, priceBought, priceSold, type);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
