package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int rozmiar = 10;
        int tabl[][] = new int[rozmiar][rozmiar];
        int tabl1[][] = new int[rozmiar][rozmiar];

        Tablica tablica = new Tablica();
        tablica.czytaj_dane(tabl,rozmiar);
        tablica.zapisz_dane_do_pliku(tabl,rozmiar);
        tablica.czytaj_dane_z_pliku(tabl,rozmiar);
    }
}

