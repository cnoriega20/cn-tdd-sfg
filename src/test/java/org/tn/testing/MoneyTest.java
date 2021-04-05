package org.tn.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMult(){
        Denomination  denomination = new Denomination(5);
        Denomination product = denomination.times(2);
        assertEquals(new Denomination(10), product);
        product = denomination.times(3);
        assertEquals(new Denomination(15), product);
    }

    @Test
    void testEquality(){
        assertEquals(new Denomination(5), new Denomination(5));
        assertNotEquals(new Denomination(5), new Denomination(8));
    }

}
