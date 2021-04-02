package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_2.WlasnaProba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tablica {
    public void czytaj_dane(int tablica[][], int rozmiar) {
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == j) {
                    tablica[i][j] = 1;
                } else {
                    tablica[i][j] = 0;
                }
            }
        }
    }

    public void do_pliku(int tablica[][], int rozmiar) throws IOException {
        FileWriter fw = new FileWriter("tablica.txt");
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                fw.write((char) (tablica[i][j]));
            }
        }
        fw.close();
    }

    public void z_pliku(int tablica[][], int rozmiar) throws IOException {
        FileReader fr = new FileReader("tablica.txt");
        BufferedReader br = new BufferedReader(fr);

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tablica[i][j] = br.read();
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        fr.close();
    }
}
