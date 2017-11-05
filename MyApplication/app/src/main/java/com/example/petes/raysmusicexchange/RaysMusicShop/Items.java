package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Sellable;

/**
 * Created by petes on 03/11/2017.
 */

public class Items extends ItemsForSale{

    String type;

    public Items(String description, double priceBought, double priceSold, String type) {
        super(description, priceBought, priceSold);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
