package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Class_a class_a = new Class_a();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj długość ciągu: ");
        int dlugosc;
        dlugosc = Integer.parseInt(br.readLine());
        for (int i = 0; i < dlugosc; i++) {
            System.out.println(i+1+") = "+class_a.ciagFibonaccieo(i));
        }

    }
}
