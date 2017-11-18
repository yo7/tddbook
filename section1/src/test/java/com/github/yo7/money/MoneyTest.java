package com.github.yo7.money;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar((15)), five.times(3));
    }

    @Test
    public void testEquality() {
       assertTrue(new Dollar(5).equals(new Dollar(5)));
       assertFalse(new Dollar(3).equals(new Dollar(5)));
    }
}
