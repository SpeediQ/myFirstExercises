package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_3;

public class Zad3_22 {
    public static void main(String[] args) {
        char znak;
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");

        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak<'Z'){

                System.out.print(znak + ", ");
            }else{
                System.out.print(znak+". ");
            }
        }
        System.out.println();
        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak>'A'){

                System.out.print(znak + ", ");
            }else{
                System.out.print(znak+". ");
            }
        }
    }
}
