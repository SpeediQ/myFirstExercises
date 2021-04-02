package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_2 {
    // Napisz program, który za pomocą instrukcji do ... while dla danych wartości x zmieniających się
    // od 0 do 10 oblicza wartość funkcji y = 3x

    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("Program rozwiązuje równanie y = 3x, dla x przyjmującego wartości z przedziału liczb naturalnych od 0 do 10");
        do {
            y = 3 * x;
            System.out.println("dla x = "+x);
            System.out.println("y = 3 * " + x);
            System.out.println("y = " + y+"\n-----------");

            x++;
        } while (x <= 10);

    }
}
