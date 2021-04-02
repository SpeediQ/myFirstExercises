package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Zad2_5_GenerowanieLosowejLiczby {
    public static void main(String[] args)
            throws IOException {
        double losuj_liczbe, zgadnij_liczbe;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program losuje liczbę z przedziału 0-9. Zgadnij tę liczbę.");
        Random r = new Random();
        losuj_liczbe = Math.round(10*(r.nextDouble()));
        zgadnij_liczbe = Double.parseDouble(br.readLine());

        if (zgadnij_liczbe == losuj_liczbe){
            System.out.println("Gratuluję odgadłeś!");
        } else {
            System.out.print("Bardzo nam przykro, ale wylosowana liczba to ");
            System.out.println((int)losuj_liczbe);
        }

    }
}
