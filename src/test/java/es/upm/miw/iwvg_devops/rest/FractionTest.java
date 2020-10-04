package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FractionTest {
    private Fraction fraction;
    @BeforeEach
    void before() {
        fraction = new Fraction(0, 1);
    }

    @Test
    void testFraction() {
        assertEquals(0, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    @Test
    void testFractionSetNumerator() {
        fraction.setNumerator(1);
        assertEquals(1, fraction.getNumerator());
    }
    @Test
    void testFractionsetSetDenominator() {
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }
    @Test
    void testFractionGetNumerator() {
        assertEquals(0, fraction.getNumerator());
    }
    @Test
    void testFractionGetDenominator(){
        assertEquals(1, fraction.getDenominator());
    }
    @Test
    void testFractiondecimal(){
        assertEquals(0, fraction.decimal());
    }

    @Test
    void testFractionIsProper(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(false, fraction.isProper(fraction.getNumerator(),fraction.getDenominator()));
    }
    @Test
    void testFractionIsImProper(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(true, fraction.isImproper(fraction.getNumerator(),fraction.getDenominator()));
    }
    @Test
    void testFractionIsEquivalent(){
        fraction.getNumerator();
        fraction.getDenominator();
        assertEquals(false, fraction.isEquivalent(fraction.getNumerator(),fraction.getDenominator()));
    }
    @Test
    void testAdd(){
        Fraction fraction;
        Fraction newFraction;
        fraction = new Fraction(1,1);
        newFraction = new Fraction(2,1);
        assertEquals(newFraction.toString(),fraction.add(fraction).toString());
    }

    @Test
    void testMultiply(){
        Fraction fraction;
        Fraction newFraction;
        fraction = new Fraction(4,1);
        newFraction = new Fraction(16,1);
        assertEquals(newFraction.toString(),fraction.multiply(fraction).toString());
    }

    @Test
    void testDivide(){
        Fraction newFraction;
        fraction = new Fraction(1,1);
        newFraction = new Fraction(1,1);
        assertEquals(newFraction.toString(),fraction.divide(fraction).toString());
    }


}
