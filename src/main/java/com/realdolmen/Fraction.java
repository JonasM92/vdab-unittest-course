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

    public Boolean equals(Fraction f) {
        Fraction a = this.simplify();
        f = f.simplify();

        return a.numerator == f.numerator && a.denominator == f.denominator;
    }

    public Double asDouble() {
        return (double)this.numerator/(double)this.denominator;
    }

}
