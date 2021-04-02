package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad4_13 {
    public static void main(String[] args) throws IOException {
        String firstName, lastName;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program policzy ilość znaków w imieniu oraz nazwisku po czym je podsumuje:");
        System.out.println("Podaj swoje imię");
        firstName = br.readLine();
        System.out.println("Podaj swoje nazwisko");
        lastName = br.readLine();

        System.out.println("Imię "+firstName+" składa się z "+firstName.length()+" znaków");
        System.out.println("Nazwisko "+lastName+" składa się z "+lastName.length()+" znaków");
        System.out.println("Łączna ilośc znaków to "+(lastName.length()+firstName.length()));

    }
}
