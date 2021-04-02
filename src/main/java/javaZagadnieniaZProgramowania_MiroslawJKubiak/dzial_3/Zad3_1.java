package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_1 {
    public static void main(String[] args) {
        //Napisz program, który za pomocą instrukcji for dla danych wartości x zmieniających się od 0 do 10 oblicza
        // wartość funki y=3x

        int x, y;
        for (int i = 0; i <= 10; i++) {
            x=i;
            y=3*x;

            System.out.print("y = "+3+" * "+x+" ---> ");
            System.out.println("y = "+y);

        }
    }
}
