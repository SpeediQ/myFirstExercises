package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tablica {
    int rozmiar = 10;
    int tablica1[][] = new int[rozmiar][rozmiar];
    int tablica2[][] = new int[rozmiar][rozmiar];
    int tablica3[][] = new int[rozmiar][rozmiar];

    public void czytaj_dane(){




        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i==1){
                    tablica1[i][j] = 1;
                } else {
                    tablica1[i][j] = 0;
                }
                System.out.print(tablica1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public void przetworz_dane(){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tablica2[i][j]= tablica1[j][i];
                System.out.print(tablica2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public void do_pliku_b() throws IOException {
        FileWriter fw = new FileWriter("tablica2.txt");
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                fw.write((char) tablica2[i][j]);
            }
        }
        fw.close();

    }
    public void odczyt_z_pliku() throws IOException{
        FileReader fr = new FileReader("tablica2.txt");
        BufferedReader br = new BufferedReader(fr);

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tablica3[i][j]= br.read();
                System.out.print(tablica3[i][j]+" ");
            }
            System.out.println();
        }
        fr.close();
    }
}
