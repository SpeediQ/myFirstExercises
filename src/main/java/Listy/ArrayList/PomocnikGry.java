package Listy.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PomocnikGry {
    private static final String alfabet = "abcdefg";
    private int dlugoscPlanszy = 7;
    private int wielkoscPlanszy = 49;
    private int[] plansza = new int[wielkoscPlanszy];
    private int iloscPortali = 0;

    public String pobierzDaneWejsciowe(String komunikat) {
        String daneWesciowe = null;
        System.out.println(komunikat + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            daneWesciowe = is.readLine();
            if (daneWesciowe.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return daneWesciowe.toLowerCase();
    }

    public ArrayList rozmiescPortal(int wielkoscPortalu) {
        ArrayList<String> zajetePole = new ArrayList<String>();
        String[] wspolrzedneLnc = new String[wielkoscPortalu];
        String pomoc = null;
        int[] wspolrzedne = new int[wielkoscPortalu];
        int prob = 0;
        boolean powodzenie = false;
        int polozenie = 0;

        iloscPortali++;
        int inkr = 1;
        if ((iloscPortali % 2) == 1) {
            inkr = dlugoscPlanszy;
        }
        while (!powodzenie & prob++ < 200) {
            polozenie = (int) (Math.random() * wielkoscPlanszy);

            int x = 0;
            powodzenie = true;
            while (powodzenie && x < wielkoscPortalu) {
                if (plansza[polozenie] == 0) {
                    wspolrzedne[x++] = polozenie;
                    polozenie += inkr;
                    if (polozenie >= wielkoscPlanszy) {
                        powodzenie = false;
                    }
                    if (x > 0 & (polozenie % dlugoscPlanszy == 0)) {
                        powodzenie = false;
                    }

                } else {
//                    System.out.println(" już zajęte "+location);
                    powodzenie = false;
                }
            }
        }
        int x = 0;
        int wiersz = 0;
        int kolumna = 0;

        while (x < wielkoscPortalu) {
            plansza[wspolrzedne[x]]=1;
            wiersz=(int)(wspolrzedne[x] / dlugoscPlanszy);
            kolumna=wspolrzedne[x]%dlugoscPlanszy;
            pomoc=String.valueOf(alfabet.charAt(kolumna));
            zajetePole.add(pomoc.concat(Integer.toString(wiersz)));
                    x++;
        }
        return zajetePole;
    }



}
