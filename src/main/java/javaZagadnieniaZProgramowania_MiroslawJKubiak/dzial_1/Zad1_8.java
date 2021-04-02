package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1_8 {
    // Napisz program, który oblicza pole prostokąta. Wartośc boków a i b wprowadzamy z klawiatury.
    // W programie należy przyjąć, że zmienne a,b oraz pole są typu double (rzeczywistego).
    // Dodatkowo w program wbuduj obsługę sytuacji wyjątkowych.

    public static void main(String[] args)
            throws IOException {
        double a, b, pole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("Podaj długoś boku a ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj długość boku b");
            b = Double.parseDouble(br.readLine());

            pole = a*b;

            System.out.println("Pole prostokąta o boku a = "+a+" oraz "+b+" wynosi = "+pole);

                    
        }
        catch (NumberFormatException exc)
        {
            System.out.println("Nie wczytano liczby, koniec programu");
        }

    }
}
