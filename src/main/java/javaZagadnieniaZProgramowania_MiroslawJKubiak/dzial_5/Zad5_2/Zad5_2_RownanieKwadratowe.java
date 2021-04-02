package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_2_RownanieKwadratowe {

    double a, b, c, delta, x, x1, x2;
    char liczbaPierwiastkow;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void czytaj_dane() throws IOException {
        System.out.println("Program oblicza równanie kwadratowe ax^2+bx+c=0\nZACZYNAJMNY!");
        System.out.print("Podaj wartość a: ");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Wartośc 'a' nie może być równa 0");
            System.exit(1);
        } else {

            System.out.print("Podaj wartość b: ");
            b = Double.parseDouble(br.readLine());
            System.out.print("Podaj wartość c: ");
            c = Double.parseDouble(br.readLine());


        }
    }

    public void przetworzDane() {
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta == 0) {

            x = -(b) / (2 * a);
        }
        if (delta > 0) {

            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        }

    }

    public void wyswietlWynik() {
        System.out.println((int) a + "x^2 + " + (int) b + "x + " + (int) c + " = 0");
        if (delta < 0) {
            System.out.println("Równanie kwadratowe nie posiada rozwiązań.");
        }
        if (delta == 0) {
            System.out.println("Równanie posiada jedno podwójne rozwiązanie.");
            System.out.print("x = ");
            System.out.printf("%2.2f.", x);


        }
        if (delta > 0) {
            System.out.println("Równanie posiada dwa rozwiązania.");
            System.out.print("x1 = ");
            System.out.printf("%2.2f.", x1);
            System.out.println();
            System.out.print("x2 = ");
            System.out.printf("%2.2f.", x2);

        }

    }
}
