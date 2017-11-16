package com.github.yo7.money;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(5);
        assertEquals(15, product.amount);
    }
}
