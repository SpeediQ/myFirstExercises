package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1_7 {
//     Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y wprowadzonych z klawiatury.
//     W programie należy założyć, że zmienne z i y są typu float (rzeczywistego). Dla zmiennych z, y, suma, różnica,
//     iloczyn, iloraz należy przyjąć format ich wyświetlania na ekranie z dokładnością do dwóch miejsc po przecinku.

    public static void main(String[] args)
            throws IOException {
        float x, y, suma, roznica, iloczyn, iloraz;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadź wartość x");
        x = Float.parseFloat(br.readLine());
        System.out.println("Wprowadź wartość y");
        y = Float.parseFloat(br.readLine());

        suma = x + y;
        roznica = x - y;
        iloczyn = x * y;
        iloraz = x / y;

        System.out.print("Wprowadziłeś następujące wartości: x = ");
        System.out.printf("%2.2f",x);
        System.out.print(", y = ");
        System.out.printf("%2.2f",y);
        System.out.println(". ");

        System.out.print("suma = ");
        System.out.printf("%2.2f",suma);
        System.out.print("\n"+"rożnica = ");
        System.out.printf("%2.2f",roznica);
        System.out.print("\n"+"iloczyn = ");
        System.out.printf("%2.2f",iloczyn);
        System.out.print("\n"+"iloraz = ");
        System.out.printf("%2.2f",iloraz);


    }


}
