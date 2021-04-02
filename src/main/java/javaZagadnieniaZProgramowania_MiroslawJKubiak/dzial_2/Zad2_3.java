package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad2_3 {
    public static void main(String[] args)
            throws IOException {
        double a, b, c, x1, x2, delta;
        char liczba_pierwiastkow = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Porogram oblicza pierwiastki równania ax^2 + bx+ c = 0");
        System.out.println("Podaj wartość a ");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozwolona wartość a");

        } else {
            System.out.println("Podaj wartość b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj wartośc c");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;
            if (delta < 0) liczba_pierwiastkow = 0;
            if (delta == 0) liczba_pierwiastkow = 1;
            if (delta > 0) liczba_pierwiastkow = 2;

            switch (liczba_pierwiastkow) {
                case 0: {
                    System.out.println("Brak pierwiastków rzeczywistych");
                }
                break;

                case 1: {
                    x1 = -b / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f", c);
                    System.out.print("\ntrójmian kwadratowy ma jeden pierwiastek podwójny");
                    System.out.printf(" x1 = " + "%4.2f.", x1);

                }
                break;
                case 2: {
                    x1 = (-b - Math.sqrt(delta))/(2*a);
                    x2 = (-b + Math.sqrt(delta))/(2*a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f", c);
                    System.out.print("\ntrójmian kwadratowy ma dwa różne pierwiastki rzeczywiste:");
                    System.out.printf("\nx1 = " + "%4.2f, ", x1);
                    System.out.printf("x2 = " + "%4.2f.", x2);

                }
                break;
            }
        }


    }
}
