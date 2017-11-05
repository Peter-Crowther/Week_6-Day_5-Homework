package com.example.petes.raysmusicexchange;

import com.example.petes.raysmusicexchange.RaysMusicShop.Guitar;
import com.example.petes.raysmusicexchange.RaysMusicShop.Shop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 03/11/2017.
 */

public class TestRaysMusicShop {

    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop("Rays");
        guitar = new Guitar("Guitar", 300, 500, "Base", "Red", 4);
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





}
