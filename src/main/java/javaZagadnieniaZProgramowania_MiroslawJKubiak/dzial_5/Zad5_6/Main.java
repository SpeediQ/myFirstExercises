package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ilosc;
        System.out.println("Podaj ilość pierwszych liczb trójkątnych");
        ilosc = Integer.parseInt(br.readLine());
        Class_a class_a = new Class_a();
        for (int i = 1; i <=ilosc ; i++) {

            System.out.println("#"+i+" = "+(int)class_a.liczbyTrojkate(i));

        }


    }
}
