package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

import java.util.Random;

public class Zad3_16 {
    public static void main(String[] args) {
        int ilosc_liczb = 5, i;
        double liczba, suma = 0, min, max;

        System.out.println("Program losuje " + ilosc_liczb + "liczb całkowitych od 0 do 99, a następnie znajduje " +
                "najmniejszą i największą oraz oblicza średnią ze wszystkich wylosowanych liczb");

        Random r = new Random();
        min = Math.round(100 * (r.nextDouble()));

        System.out.print("Wylosowano liczby: " + (int)min + ", ");
        max = min;
        suma = suma + max;

        for (i = 1; i <= ilosc_liczb - 1; i++) {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print((int)liczba + ", ");
            if (max<liczba) max = liczba;
            if (liczba<min) min = liczba;

            suma+=liczba;
        }
        System.out.println();
        System.out.println("największa liczba to "+(int)max+",");
        System.out.println("najmniejsza liczba to "+(int)min+",");
        System.out.println("srednia = "+suma/ilosc_liczb+".");
    }
}
