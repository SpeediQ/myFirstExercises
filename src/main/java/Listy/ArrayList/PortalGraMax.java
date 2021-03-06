package Listy.ArrayList;

import java.util.ArrayList;

public class PortalGraMax {


    private PomocnikGry pomocnik = new PomocnikGry();
    private ArrayList<Portal> listaPortali = new ArrayList<Portal>();
    private int iloscRuchow = 0;

    private void przygotujGre() {
        // Tworzenie i określanie położenia portali
        Portal pierwszy = new Portal();
        pierwszy.setNazwa("onet.pl");

        Portal drugi = new Portal();
        drugi.setNazwa("wp.pl");

        Portal trzeci = new Portal();
        trzeci.setNazwa("Go2.com");

        listaPortali.add(pierwszy);
        listaPortali.add(drugi);
        listaPortali.add(trzeci);

        System.out.println("Twoim celem jest zatopienie trzech portali.");
        System.out.println("onet.pl, wp.pl, Go2.com");
        System.out.println("Postaraj się je utopić w jak najmniejszej ilości ruchów");

        for (Portal rozmieszczonyPortal : listaPortali) {
            ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
            rozmieszczonyPortal.setPolaPolozenia(nowePolozenie);
            System.out.println("Tutaj" + nowePolozenie);
        }

    }

    private void rozpocznijGre() {
        while (!(listaPortali.isEmpty())) {
            String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: ");
            sprawdzRuchgracza(ruchGracza);
        }
        zakonczGre();

    }

    private void sprawdzRuchgracza(String ruch) {
        iloscRuchow++;
        String wynik = "pudło";

        for (Portal portalDoSprawdzenia : listaPortali) {
            wynik = portalDoSprawdzenia.sprawdz(ruch);
            if (wynik.equals("trafiony")) {
                break;
            }
            if (wynik.equals("zatopiony")) {
                listaPortali.remove(portalDoSprawdzenia);
                break;
            }

        }
        System.out.println(wynik);

    }

    private void zakonczGre() {
        System.out.println("Wszystkie portale zostały zatopione! teraz Twoje informacje nie mają znaczenia.");
        if (iloscRuchow <= 18) {
            System.out.println("Wykonałeś jedynie " + iloscRuchow + " ruchów.");
            System.out.println("Wydostałeś się zanim Twoje informacje zatoneły.");

        } else {
            System.out.println("Ale się grzebałeś!. Wykonałeś aż " + iloscRuchow + " ruchów.");
            System.out.println("Teraz rybki pływają pomiędzy Twoimi informacjami.");
        }

    }

    public static void main(String[] args) {
        PortalGraMax gra = new PortalGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }


}
