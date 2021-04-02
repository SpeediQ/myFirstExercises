package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

import java.util.Random;

public class Zad3_17 {
    public static void main(String[] args) {
        System.out.println("Program losuje 5 liczba z przedziału 0-99, wskazuje wartośc minimalną, maksymalną oraz średnią");
        int i = 0, liczbaLosowan = 5;
        double min, max, suma = 0, wylosowanaLiczba;


        Random r = new Random();

        System.out.println("Wylosowane 5 wartości:");
        min = Math.round(100 * (r.nextDouble()));
        max = min;
        suma += min;

        System.out.print(min + ", ");

        do {
            wylosowanaLiczba = Math.round(100 * (r.nextDouble()));
            if (wylosowanaLiczba > max) max = wylosowanaLiczba;
            if (wylosowanaLiczba < min) min = wylosowanaLiczba;
            suma+=wylosowanaLiczba;
            System.out.print(wylosowanaLiczba+", ");

            i++;
        } while (i < liczbaLosowan - 1);

        System.out.println("\nSuma wylosownaych liczb: "+suma);
        System.out.println("Wartość minimalna: "+min);
        System.out.println("Wartośc maksymalna: "+max);
        System.out.println("Średnia: "+(suma/liczbaLosowan));

    }
}
