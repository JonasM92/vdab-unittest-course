package com.realdolmen;

/**
 * Created by jeansmits on 04/06/15.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.denominator=denominator;
        this.numerator=numerator;
    }

    public Fraction simplify() {
        this.numerator= numerator/Utilities.greatestCommonFactor(numerator,denominator);
        this.denominator= denominator/Utilities.greatestCommonFactor(numerator,denominator);

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
        return (double)this.numerator/(double)this.denominator;
    }

}
