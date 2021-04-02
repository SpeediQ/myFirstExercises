package sda.RationalNumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber oneThird = new RationalNumber(1,2);
        System.out.println(oneThird);
        System.out.println(oneThird.getOpposite());
        System.out.println(oneThird.getInverse());
        System.out.println(oneThird.multiply(new RationalNumber(2,3)));
        System.out.println(oneThird.divide(new RationalNumber(3,5)));
        System.out.println(oneThird.add1(2));
        System.out.println("reszta "+oneThird.nWDMetod(500, 36));
        RationalNumber myExample = new RationalNumber(282,78);
        System.out.println(myExample.reduce());
        System.out.println(oneThird.add(new RationalNumber(1, 2)));
    }
}
