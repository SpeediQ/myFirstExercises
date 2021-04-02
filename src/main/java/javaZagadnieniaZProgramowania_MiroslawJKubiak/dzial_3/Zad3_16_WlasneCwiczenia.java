package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Zad3_16_WlasneCwiczenia {
    public static void main(String[] args) throws IOException {
//        int iloscLiczb;
        double iloscLiczb;
        double suma, min, max, wylosowanaLiczba;


        BufferedReader konsola = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj ilość losowanych liczb");
//        iloscLiczb = Integer.parseInt(konsola.readLine());
        iloscLiczb = Double.parseDouble(konsola.readLine());


//        iloscLiczb = 5;
        Random r = new Random();
        min = Math.round(10 * (r.nextDouble()));
        System.out.print((int)min + ", ");
        max = min;

        suma = min;
        for (int i = 0; i < iloscLiczb - 1; i++) {
            if (i<iloscLiczb-2){
                wylosowanaLiczba = Math.round(100 * (r.nextDouble()));
                System.out.print((int)wylosowanaLiczba + ", ");
            } else{
                wylosowanaLiczba = Math.round(100 * (r.nextDouble()));
                System.out.print((int)wylosowanaLiczba + "");
            }



            if (wylosowanaLiczba > max) max = wylosowanaLiczba;
            if (wylosowanaLiczba < min) min = wylosowanaLiczba;

            suma = suma + wylosowanaLiczba;
        }
        System.out.println("\nWartość minimalna: "+(int)min);
        System.out.println("Wartość maksymalna: "+(int)max);
        System.out.println("Suma wszystkich wartości: "+suma);
        System.out.println("Średnia- "+(suma/iloscLiczb));
        /**
         *
         */


    }
}
