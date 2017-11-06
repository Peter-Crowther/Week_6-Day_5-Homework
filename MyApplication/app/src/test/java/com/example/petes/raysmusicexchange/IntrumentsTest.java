package com.example.petes.raysmusicexchange;

import com.example.petes.raysmusicexchange.RaysMusicShop.*;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by petes on 03/11/2017.
 */

public class IntrumentsTest {
    Flute flute;
    Guitar guitar;
    Trumpet trumpet;


    @Before
    public void before() {
        flute = new Flute("Flute", 150, 225, "Piccolo", "Silver", 16);
        trumpet = new Trumpet("Trumpet", 120, 150, "Bass", "Bronze", 3);
        guitar = new Guitar("Guitar", 80, 120, "Acoustic", "Red", 5);
    }

    @Test
    public void hasDescription() {
        assertEquals("Flute", flute.getDescription());
        assertEquals("Guitar", guitar.getDescription());
        assertEquals("Trumpet", trumpet.getDescription());
    }


    @Test
    public void hasBoughtPrice(){
        assertEquals(150, flute.getPriceBought(), 0.001);
        assertEquals(80, guitar.getPriceBought(), 0.001);
        assertEquals(120, trumpet.getPriceBought(), 0.001);
    }

    @Test
    public void hasSoldPrice() {
        assertEquals(225, flute.getPriceSold(), 0.001);
        assertEquals(120, guitar.getPriceSold(), 0.001);
        assertEquals(150, trumpet.getPriceSold(), 0.001);
    }

    @Test
    public void hasType() {
        assertEquals("Piccolo", flute.getType());
        assertEquals("Bass", trumpet.getType());
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", flute.getColour());
        assertEquals("Red", guitar.getColour());
        assertEquals("Bronze", trumpet.getColour());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(16, flute.getNumberOfKeyHoles());
    }

    @Test
    public void hasStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void hasValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Rootatoot", trumpet.play());
        assertEquals("Flootytoot!", flute.play());
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
    assertEquals(75, flute.calculateMarkup(), 0.001);
    assertEquals(40, guitar.calculateMarkup(), 0.001);
    assertEquals(30, trumpet.calculateMarkup(), 0.001);
    }

}
