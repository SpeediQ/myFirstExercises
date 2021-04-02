package test2.lambda;

import test2.klasaAnonimowa.Interfejs;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        kalkulator dodaj = (int a, int b) -> System.out.println(a + b);
        kalkulator odejmij = (int a, int b) -> System.out.println(a - b);
        kalkulator pomnoz = (int a, int b) -> System.out.println(a * b);

        intKalkulator dodajInt = (int a, int b) -> {
            return a + b;
        };

        System.out.println(dodajInt.action(100, 500));

        dodaj.action(10, 5);
        odejmij.action(10, 5);
        pomnoz.action(10, 5);

        Test test = new Test();

    }



}


interface kalkulator {
    void action(int a, int b);
}

interface intKalkulator {
    int action(int a, int b);
}
class Test{
    public void metoda(intKalkulator myInterface){
        myInterface.action(10,50);
    }
}

