package LambdaStream.Lambda_JavaStart.Samodzielny_Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    private void run() {
        List<String> names = new ArrayList<>();
        names.add("Mariola");
        names.add("Ala");
        names.add("Klaudia");
        names.add("KlaudiaNajdłuższa");
        names.add("Tomek");
        names.add("Witold");
        names.add("Mariusz");
        names.add("Natalia");
        names.add("Konrad");

        names.sort((o1,o2)->Integer.compare(o1.length(),o2.length()));
        zmianaListy(names,imie->imie+"!");
    }

    private void zmianaListy(List<String> imiona, Modyfikator modyfikator) {
        List<String> zmienioneImiona = new ArrayList<>();


        for (String newNames : imiona) {
            String modifiednames = modyfikacjeImion(newNames, modyfikator);
            zmienioneImiona.add(modifiednames);
        }

        for (String wyswietl : zmienioneImiona) {
            System.out.print(wyswietl+" ");
        }

    }

    private String modyfikacjeImion(String string, Modyfikator modyfikator) {
        return modyfikator.modifikacja(string);
    }


}
