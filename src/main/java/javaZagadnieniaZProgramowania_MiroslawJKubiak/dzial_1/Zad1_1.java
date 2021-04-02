package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// w celu czytania z  klawiatury liter i cyfr należy skorzystać z dwóch klas: Input Streamreader oraz Bufferedreader.
// najpierw tworzymy nowy obiekt klasy InputStreamReader, przekazując jej konstruktorowi obiekt System.in.

public class Zad1_1 {
    public static void main(String[] args)
            throws IOException {
        double a, b, pole;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program oblicza pole prostokąta");
        System.out.println("Podaj bok a");

//        Powstały obiekt klasy ButteredReader możemy przypisać do zmiennej referencyjnej br i dalej,
//        poprzez metodę readLine(), możemy wykorzystać go do wczytywania zmiennej a typu double
//        ze strumienia wejściowgo.
//
//        Wczytywanie liczb odbywa się tak samo jak wczytywanie tekstu, musimy jednak dokonać odpowiedniej konwersji,
//        tzn. zmiany ciągu znaków na odpowiadającą mu wartość liczbową.

        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj bok b");
        b = Double.parseDouble(br.readLine());

        pole = a * b;
        System.out.print("Pole prostokąta o boku a = " + a + " i boku b = " + b);
        System.out.println(" wynosi " + pole + ".");
    }
}
