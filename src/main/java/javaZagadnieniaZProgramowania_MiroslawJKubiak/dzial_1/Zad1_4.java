package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1_4 {
    public static void main(String[] args)
            throws IOException {
        double r, objetosc;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza objętość kuli.");
        System.out.println("Podaj promień r. ");
        r = Double.parseDouble(br.readLine());

        objetosc = (4.00 / 3.00) * Math.PI * r * r * r;

        System.out.print("Objętość kuli o promieniu r = ");
        System.out.printf("%2.2f", r);
        System.out.print(" wynosi ");
        System.out.printf("%2.2f", objetosc);




    }
}
