package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_3;

import java.util.Random;

public class Class_a {
    public void czytaj_dane(double[][] macierz, int rozmiar){
        Random random = new Random();




        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i==j){
                    macierz[i][j]= Math.round(9*(random.nextDouble()));
                } else {
                    macierz[i][j]=0;
                }
            }
        }
    }
    public double przetworz_dane(double[][] macierz, int rozmiar){
        double suma=0;

        for (int i = 0; i < rozmiar; i++) {
            suma+=macierz[i][i];

        }

        return suma;
    }
    public void wyswietl_wynik(double[][] macierz, int rozmiar){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                System.out.print((int)macierz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
