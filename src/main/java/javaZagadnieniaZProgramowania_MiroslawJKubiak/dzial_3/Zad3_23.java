package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_23 {
    public static void main(String[] args) {
        char znak;

        znak = 'A';
        do {
            if (znak < 'Z') {
                System.out.print(znak + ", ");
            } else {
                System.out.print(znak + ". ");
            }
            znak++;
        } while (znak <= 'Z');

        System.out.println();

        znak = 'Z';
        do {
            if (znak > 'A') {

                System.out.print(znak + ", ");
            } else {
                System.out.print(znak + ". ");
            }
            znak--;
        } while (znak >= 'A');
    }
}
