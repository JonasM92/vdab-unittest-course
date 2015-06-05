package com.realdolmen;

/**
 * Created by jeansmits on 04/06/15.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.denominator=denominator;
        this.numerator=numerator;
    }

    public Fraction simplify() {
        int i = Utilities.greatestCommonFactor(numerator, denominator);
        this.setNumerator(numerator/i);
        this.setDenominator(denominator/i);

        return this;
    }

    @Override
    public String toString() {

        return this.numerator + "/" + this.denominator;

    }

    @Override
    public boolean equals(Object o) {
        Fraction a = this.simplify();
        Fraction b = ((Fraction)o).simplify();

        return a.numerator == b.numerator && a.denominator == b.denominator;
    }

    public Double asDouble() {
        return (double)this.getNumerator()/(double)this.getDenominator();
    }

}
