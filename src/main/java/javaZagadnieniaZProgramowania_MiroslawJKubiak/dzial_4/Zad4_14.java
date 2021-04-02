package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad4_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lancuch1, lancuch2;

        System.out.println("Program składa dwa łańcuchy");
        System.out.println("Podaj pierwszy łańcuch");
        lancuch1 = br.readLine();
        System.out.println("Podaj drugi łańcuch");
        lancuch2 = br.readLine();

        System.out.println("Łączenie nie jest przemienne!");
        System.out.println("Pierwszy z drugim - "+(lancuch1+lancuch2));
        System.out.println("Drugi z pierwszym - "+(lancuch2+lancuch1));

    }
}
