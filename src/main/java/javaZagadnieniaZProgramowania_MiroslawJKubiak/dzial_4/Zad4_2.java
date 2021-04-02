package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

public class Zad4_2 {
    public static void main(String[] args) {
        System.out.println("Tablica wyświetlająca wartości od 9-0");
        int i, n = 10;

        int[] tablica = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = n - i - 1;
            System.out.println("tablica [" + i + "] = " + tablica[i]);
        }


    }
}
