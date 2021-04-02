package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad2_4 {
    public static void main(String[] args)
            throws IOException {
        double a, b, c, x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza wartość x z równania  ax + b = c");
        System.out.println("Wprowadź wartość a");
        a = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Wprowadzona wartośc jest błędna ( równa zeru )");
        } else {
            System.out.println("Wprowadź wartość b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Wprowadź wartośc c");
            c = Double.parseDouble(br.readLine());

            x = (c - b) / a;
            System.out.printf("Wprowadzone następujące wartości\n a = " + "%4.2f,", a);
            System.out.printf("  b = " + "%4.2f,", b);
            System.out.printf("  c = " + "%4.2f.", c);
            System.out.println("\nWartość x wynosi:");
            System.out.printf("x = " + "%4.2f.", x);


        }

    }
}
