package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tablica tablica = new Tablica();
        tablica.czytaj_dane();
        tablica.przetworz_dane();
        tablica.do_pliku_b();
        tablica.odczyt_z_pliku();

    }
}
