package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_5.Zad5_8oraz9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osoba {
    String imie, nazwisko, ulica, kod, miasto;
    public void inicjuj() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj imię: ");
        imie = br.readLine();
        System.out.print("Podaj nazwisko: ");
        nazwisko = br.readLine();
        System.out.print("Podaj ulice: ");
        ulica = br.readLine();
        System.out.print("Podaj kod pocztowy: ");
        kod = br.readLine();
        System.out.print("Podaj miasto: ");
        miasto = br.readLine();

    }
    public void drukuj(){
        System.out.println("Użytkownik wypisał następujące dane:");
        System.out.println("Imię i naswisko: "+imie+" "+nazwisko);
        System.out.println("Adres: ul. "+ulica+"\n" +kod+" "+miasto);
    }
}
