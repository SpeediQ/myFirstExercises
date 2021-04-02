package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_3 {

    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("Program rozwiązuje równanie y = 3x, dla x przyjmującego wartości z przedziału liczb naturalnych od 0 do 10");
        while (x<=10) {
            y = 3 * x;
            System.out.println("dla x = "+x);
            System.out.println("y = 3 * " + x);
            System.out.println("y = " + y+"\n-----------");

            x++;
        }

    }
}
