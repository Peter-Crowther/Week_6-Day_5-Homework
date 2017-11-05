package com.example.petes.raysmusicexchange.RaysMusicShop;

import com.example.petes.raysmusicexchange.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by petes on 03/11/2017.
 */

public class Shop {

    String name;
    ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    public void addToStock(Sellable item) {
        this.stock.add(item);
    }

    public void removeFromStock(Sellable item) {
        this.stock.remove(item);
    }

    public int getArrayLength() {
        return stock.size();
    }
}
