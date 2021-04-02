package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad4_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int suma, n;
        suma = 0;

        System.out.println("Podaj wielkość tablicy jednowymiarowej: ");
        n = br.read(); // Dlaczego to nie działa?
        n = 100;
        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            tablica[i] = i + 1;
            suma += tablica[i];
        }

        for (int x : tablica) {

            System.out.print(x + " ");

        }
        System.out.println("\nSuma wszystkich wartości: " + suma);
    }
}
