package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_2;

import java.io.IOException;

public class Zad5_2_Main {
    public static void main(String[] args) throws IOException {
        Zad5_2_RownanieKwadratowe rownanieKwadratowe = new Zad5_2_RownanieKwadratowe();
        rownanieKwadratowe.czytaj_dane();
        rownanieKwadratowe.przetworzDane();
        rownanieKwadratowe.wyswietlWynik();
    }
}
