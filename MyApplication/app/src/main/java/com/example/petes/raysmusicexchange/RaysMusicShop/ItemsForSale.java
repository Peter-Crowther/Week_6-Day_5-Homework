package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by petes on 03/11/2017.
 */

abstract public class ItemsForSale implements Sellable{

    String description;
    double priceBought;
    double priceSold;

    public ItemsForSale(String description, double priceBought, double priceSold) {
        this.priceBought = priceBought;
        this.priceSold = priceSold;
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }


    public double getPriceBought() {
        return this.priceBought;
    }

    public double getPriceSold() {
        return this.priceSold;
    }
    @Override
    public double calculateMarkup() {
        return priceSold - priceBought;
    }
}
