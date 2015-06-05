package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeansmits on 04/06/15.
 */
public class FractionTest {

    @Test
    public void fractionSimplificationTest() {
        Fraction a = new Fraction(4,8);
        Fraction b = new Fraction(1,2);
        assertEquals(b, a.simplify());
    }

    @Test
    public void fractionToStringTest() {
        Fraction f = new Fraction(3,4);
        assertEquals("3/4", f.toString());
    }

    @Test
    public void fractionAsDoubleTest() {
        Fraction f = new Fraction(3,4);
        Double d = 0.75;
        assertEquals(d, f.asDouble());
    }

    @Test
    public void fractionEqualsFractionTest() {
        Fraction a = new Fraction(4,8);
        Fraction b = new Fraction(1,2);
        assertEquals(true, a.equals(b));
    }
}
