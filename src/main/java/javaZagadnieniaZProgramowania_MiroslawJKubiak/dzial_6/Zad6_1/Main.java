package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Osoba osoba =  new Osoba();
        osoba.czytaj_dane();
        osoba.zapisz_dane_do_pliku();
        osoba.czytaj_dane_z_pliku();
    }
}
