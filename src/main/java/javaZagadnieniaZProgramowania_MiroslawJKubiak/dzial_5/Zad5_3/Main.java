package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_3;

public class Main {
    public static void main(String[] args) {
        Class_a klasa = new Class_a();

        int wielkosc=10;
        double[][] tablica = new double[wielkosc][wielkosc];
        klasa.czytaj_dane(tablica,wielkosc);
        klasa.przetworz_dane(tablica,wielkosc);
        klasa.wyswietl_wynik(tablica,wielkosc);
        System.out.println("Suma elementów na przekątnej = " +(int)klasa.przetworz_dane(tablica,wielkosc));
    }
}
