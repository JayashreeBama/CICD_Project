package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
    @Test
    public void testPallin(){
        String inp="Hello";
        Boolean exp=false;
        assertEquals(exp, App.pallindrome(inp));
    }
    @Test
    public void testPallinCase(){
        String inp="Malayalam";
        Boolean exp=false;
        assertEquals(exp, App.pallindrome(inp));
    }
    @Test
    public void testPallinCrt(){
        String inp="malayalam";
        Boolean exp=true;
        assertEquals(exp, App.pallindrome(inp));
    }
}
