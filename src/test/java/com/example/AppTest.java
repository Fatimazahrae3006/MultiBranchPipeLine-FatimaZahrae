package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testGetMessage() {
        App app = new App();
        String message = app.getMessage();
        assertNotNull("Le message ne doit pas être null", message);
        assertTrue("Le message doit contenir 'MultiBranch'", 
                   message.contains("MultiBranch"));
    }
    
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals("2 + 3 devrait égaler 5", 5, app.add(2, 3));
        assertEquals("10 + 20 devrait égaler 30", 30, app.add(10, 20));
    }
    
    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals("2 * 3 devrait égaler 6", 6, app.multiply(2, 3));
        assertEquals("5 * 4 devrait égaler 20", 20, app.multiply(5, 4));
    }
}