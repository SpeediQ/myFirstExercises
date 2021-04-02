package sda.RationalNumber;

public class RationalNumber {
    private int numerator;
    private int denominator;
    private int integer;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be equal to 0 ");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber(int integer) {
        this.integer = integer;
    }

    public RationalNumber getOpposite() {
        return new RationalNumber(numerator * (-1), denominator);
    }

    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber multiply(RationalNumber newRationalNumber) {
        return new RationalNumber(numerator * newRationalNumber.numerator, denominator * newRationalNumber.denominator);
    }

    public RationalNumber divide(RationalNumber newRationalNumber) {
        return new RationalNumber(numerator * newRationalNumber.denominator, denominator * newRationalNumber.numerator);
    }

    public RationalNumber add1(int addNumber) {
        return new RationalNumber(numerator + (denominator * addNumber), denominator);
    }

    public int nWDMetod(int a, int b) {
        return RationalNumber.nwd(a, b);
    }

    public RationalNumber reduce() {
        int nwd = RationalNumber.nwd(numerator, denominator);
        return new RationalNumber(numerator / nwd, denominator / nwd);
    }

    public RationalNumber add(RationalNumber rationalNumber) {
        // zmienić zapis
        int den1 = denominator;
        int den2 = rationalNumber.denominator;

        denominator *= den2;
        rationalNumber.denominator = denominator;
        numerator *= den2;
        rationalNumber.numerator *= den1;

        int solutionNum = numerator + rationalNumber.numerator;
        int solutionDen = denominator;

        return new RationalNumber(solutionNum, solutionDen).reduce();

    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // liczby ujemne
    private static int nwd(int a, int b) {
        int rest = a % b;
        while (rest != 0) {
            a = b;
            b = rest;
            rest = a % b;

        }
        return b;
    }
}
