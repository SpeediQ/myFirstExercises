package test2.kolejnyTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Klasa klasa = new Klasa();
        klasa.deff();
        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(5000);
        pracownik[1] = new Pracownik(10000);
        pracownik[2] = new Pracownik(3000);

        Arrays.sort(pracownik);
        for (Pracownik pracownik1 : pracownik) {
            System.out.println(pracownik1.getSalary());
        }

        System.out.println(pracownik[0].compareTo(pracownik[2]));
    }


}
