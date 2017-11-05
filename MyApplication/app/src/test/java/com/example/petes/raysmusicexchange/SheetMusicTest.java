package com.example.petes.raysmusicexchange;

import com.example.petes.raysmusicexchange.RaysMusicShop.SheetMusic;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 05/11/2017.
 */

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Sheetmusic", 4, 10, "The Eagles", "Hotel California");
    }

    @Test
    public void hasDescription() {
        assertEquals("Sheetmusic", sheetMusic.getDescription());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(4, sheetMusic.getPriceBought(), 0.001);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(10, sheetMusic.getPriceSold(), 0.001);
    }

    @Test
    public void hasType() {
        assertEquals("The Eagles", sheetMusic.getType());
    }

    @Test
    public void hasName() {
        assertEquals("Hotel California", sheetMusic.getName());
    }


}
