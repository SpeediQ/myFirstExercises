package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_8oraz9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadra extends Osoba {
    String wyksztalcenie, stanowisko;
    public void inicjuj1() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        inicjuj();

        System.out.print("Podaj wykształcenie: ");
        wyksztalcenie = br.readLine();
        System.out.print("Podaj stanowisko: ");
        stanowisko = br.readLine();


    }
    public void drukuj1(){

        drukuj();

        System.out.println("Wykształcenie: "+wyksztalcenie);
        System.out.println("Stanowisko: "+stanowisko);
    }
}
