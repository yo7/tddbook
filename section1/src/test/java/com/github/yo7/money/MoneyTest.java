package com.github.yo7.money;

import org.junit.Test;

import java.awt.event.MouseEvent;

import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(3).equals(Money.dollar(5)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(3).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc((15)), five.times(3));
    }
}
