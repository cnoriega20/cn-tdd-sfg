package org.tn.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultDollar(){
        Denomination five = Denomination.createDollar(5);
        assertEquals(Denomination.createDollar(10), ((Dollar) five).times(2));
        assertEquals(Denomination.createDollar(15), ((Dollar) five).times(3));
    }

    @Test
    void testEqualityDollar(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testDollarNotFranc(){
        assertNotEquals(new Dollar(5), new Franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = Denomination.createFranc(5);
        assertEquals(Denomination.createFranc(10), five.times(2));
        assertEquals(Denomination.createFranc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }

}
