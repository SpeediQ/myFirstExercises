package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad2_2 {
    // Napisz program, który oblicza pierwiastki równania kwadratowego ax^2+bx+c=0 z wykorzystaniem instrukcji
    // warunkowej if, gdzie zmienne a,b,c to liczby rzeczywiste wprowadzane z kalwiatury. Dla zmiennycha,b,c,x1 oraz x2
    // należy przyjąć format wyświetlania ich na ekranie z dokładnością do dwóch miejsc po przecinku.
    public static void main(String[] args)
            throws IOException {
        double a, b, c, delta, x1, x2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0.");
        System.out.println("Podaj wartośc a");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("wartość nieprawidłowa");

        } else {
            System.out.println("Podaj wartość b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj wartość c");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("brak pierwiastków rzeczywistych");

            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf("b = " + "%4.2f\n,", b);
                    System.out.printf("c = " + "%4.2f", c);
                    System.out.print("trójmian ma jeden pierwiastek podwójny x1 = ");
                    System.out.printf("%4.2f,", x1);
                    System.out.println("");

                } else {
                    x1 = ((-b - Math.sqrt(delta)) / (2 * a));
                    x2 = ((-b + Math.sqrt(delta)) / (2 * a));
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf("c = " + "%4.2f\n", c);
                    System.out.println("trójmia ma dwa pierwiastki: ");
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f", x1);
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f", x2);
                    System.out.println("");

                }
            }
        }


    }


}
