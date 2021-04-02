package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_4;

public class Main {
    public static void main(String[] args) {
        int rozmiar=80;
        double[] tablica = new double[rozmiar];

        Class_a klasa = new Class_a();
        klasa.czytaj_dane(tablica,rozmiar);
        klasa.przetworz_dane(tablica,rozmiar);
        klasa.wyswietl_wynik(tablica,rozmiar);
    }
}
