package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad5_1 {
    double a, b, pole;

    public void czytaj_dane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta.");
        System.out.println("Podaj wartość a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj wartość b:");
        b = Double.parseDouble(br.readLine());
    }

    public void przetworz_dane() {
        pole = a * b;
    }

    public void wyswietl_wynik() {
        System.out.print("Pole prostokąta o boku a= ");
        System.out.printf("%2.2f", a);
        System.out.print(" i boku b= ");
        System.out.printf("%2.2f ", b);
        System.out.print("wynosi = ");
        System.out.printf("%2.2f",pole);
    }
}


