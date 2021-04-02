package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_2.WlasnaProba;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int rozmiar = 10;
        int tab[][] = new int[rozmiar][rozmiar];

        Tablica tablica = new Tablica();
        tablica.czytaj_dane(tab,rozmiar);
        tablica.do_pliku(tab,rozmiar);
        tablica.z_pliku(tab,rozmiar);

    }
}
