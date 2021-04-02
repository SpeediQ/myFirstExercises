package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tablica {
    int rozmiar = 10;

    public void czytaj_dane(int tablica[][], int rozmiar) {
        System.out.println("Tworzymy tablicę 10x10.");

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == j) {
                    tablica[i][j] = 1;
                } else {
                    tablica[i][j] = 0;
                }
                //System.out.print(tablica[i][j] + " ");

            }
            //System.out.println();
        }


    }

    public void zapisz_dane_do_pliku(int tablica[][], int rozmiar) throws IOException {
        System.out.println("\nZapisujemy tablicę do pliku");

        FileWriter fw = new FileWriter("dane.txt");
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                fw.write((char) (tablica[i][j]));
                //System.out.print(tablica[i][j]+" ");

            }
            //System.out.println();
        }
        fw.close();

    }

    public void czytaj_dane_z_pliku(int tablica[][], int rozmiar) throws IOException{
        System.out.println("\nOdczytujemy tablice z pliku");
        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tablica[i][j] = (int) br.read();
                System.out.print(tablica[i][j]+" ");
            }
            System.out.println();
        }
        fr.close();

    }

}
