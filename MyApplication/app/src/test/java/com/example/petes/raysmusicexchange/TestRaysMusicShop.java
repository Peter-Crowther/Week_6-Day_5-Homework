package com.example.petes.raysmusicexchange;

import com.example.petes.raysmusicexchange.RaysMusicShop.*;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 03/11/2017.
 */

public class TestRaysMusicShop {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    Flute flute;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop("Rays");
        flute = new Flute("Flute", 150, 225, "Piccolo", "Silver", 16);
        trumpet = new Trumpet("Trumpet", 120, 150, "Bass", "Bronze", 3);
        guitar = new Guitar("Guitar", 80, 120, "Acoustic", "Red", 5);
        sheetMusic = new SheetMusic("Sheetmusic", 4, 10, "The Eagles", "Hotel California");
    }

    @Test
    public void shopHasName() {
        assertEquals("Rays", shop.getName());
    }

    @Test
    public void testArrayEmpty() {
    assertEquals(0, shop.getArrayLength());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getArrayLength());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getArrayLength());
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getArrayLength());
    }

    @Test
    public void canCaclulateTotalProfit() {
        shop.addToStock(guitar);
        shop.addToStock(flute);
        shop.addToStock(trumpet);
        shop.addToStock(sheetMusic);
        assertEquals(151, shop.getTotalProfit(), 0.001);
    }





}
