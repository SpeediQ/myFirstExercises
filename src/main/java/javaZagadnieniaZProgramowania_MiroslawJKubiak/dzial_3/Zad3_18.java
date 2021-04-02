package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

import java.util.Random;

public class Zad3_18 {
    public static void main(String[] args) {
        System.out.println("Program losuje 5 liczba z przedziału 0-99, wskazuje wartośc minimalną, maksymalną oraz średnią");
        int i = 0, liczbaLosowan = 5;
        double min, max, suma = 0, wylosowanaLiczba;



        Random losowanie = new Random();
        min = Math.round(100 * (losowanie.nextDouble()));
        System.out.print(min + ", ");

        max = min;
        suma = suma + min;

        while (i < liczbaLosowan - 1) {
            if (i < liczbaLosowan - 2) {
                wylosowanaLiczba = Math.round(100 * (losowanie.nextDouble()));
                System.out.print(wylosowanaLiczba + ", ");

            } else {
                wylosowanaLiczba = Math.round(100 * (losowanie.nextDouble()));
                System.out.print(wylosowanaLiczba);
            }
            if (wylosowanaLiczba<min) min=wylosowanaLiczba;
            if (wylosowanaLiczba>max) max=wylosowanaLiczba;

            suma += wylosowanaLiczba;
            i++;
        }
        System.out.println("\nSuma wylosownaych liczb: "+suma);
        System.out.println("Wartość minimalna: "+min);
        System.out.println("Wartośc maksymalna: "+max);
        System.out.println("Średnia: "+(suma/liczbaLosowan));


    }
}
