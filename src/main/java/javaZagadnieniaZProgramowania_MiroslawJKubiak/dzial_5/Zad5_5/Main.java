package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        Silnia silnia = new Silnia();
        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej\nPodaj n.");
        n= Integer.parseInt(br.readLine());
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+"! = "+silnia.zWartosci(i));
        }

    }
}
