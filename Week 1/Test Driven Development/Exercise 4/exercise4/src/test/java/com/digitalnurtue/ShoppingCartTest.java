package com.digitalnurtue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    // 1. Declare the object we want to test
    private ShoppingCart cart;

    // The @Before method runs automatically BEFORE every single @Test method.
    // It guarantees a fresh, empty cart for every test so they don't interfere with each other.
    @Before
    public void setUp() {
        System.out.println("Running Setup: Creating a fresh cart.");
        cart = new ShoppingCart();
    }

    // The @After method runs automatically AFTER every single @Test method.
    // Good for cleanup (e.g., clearing memory, closing files).
    @After
    public void tearDown() {
        System.out.println("Running Teardown: Emptying the cart.");
        cart.emptyCart();
        cart = null;
    }

    @Test
    public void testAddItemUsingAAA() {
        // --- ARRANGE ---
        // Set up the specific data needed for this exact test
        String itemToBuy = "Laptop";
        
        // --- ACT ---
        // Perform the action you are testing
        cart.addItem(itemToBuy);
        
        // --- ASSERT ---
        // Verify the outcome is exactly what you expected
        assertEquals(1, cart.getItemCount());
    }
    
    @Test
    public void testAddMultipleItemsUsingAAA() {
        // --- ARRANGE ---
        String item1 = "Mouse";
        String item2 = "Keyboard";
        
        // --- ACT ---
        cart.addItem(item1);
        cart.addItem(item2);
        
        // --- ASSERT ---
        assertEquals(2, cart.getItemCount());
    }
}