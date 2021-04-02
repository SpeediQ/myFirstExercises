package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_4;

import java.util.Random;

public class Class_a {
    public void czytaj_dane(double[] liczby, int n) {

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            liczby[i] = Math.round(100 * (random.nextDouble()));
        }


//        liczby[0] = Math.round(9 * (random.nextDouble()));
//        liczby[1] = Math.round(9 * (random.nextDouble()));
//        liczby[2] = Math.round(9 * (random.nextDouble()));
//        liczby[3] = Math.round(9 * (random.nextDouble()));
//        liczby[4] = Math.round(9 * (random.nextDouble()));
//        liczby[5] = Math.round(9 * (random.nextDouble()));

    }

    public void przetworz_dane(double[] liczby, int n) {
        double x;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j];
                    liczby[j] = liczby[j - 1];
                    liczby[j - 1] = x;
                }


            }
        }
    }

    public void wyswietl_wynik(double[] liczby, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print((int)liczby[i]+" ");
        }
    }

}
