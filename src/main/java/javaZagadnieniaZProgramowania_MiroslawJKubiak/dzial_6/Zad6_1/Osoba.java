package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_6.Zad6_1;

import java.io.*;

public class Osoba {
    String dane,dane1;
    public void czytaj_dane() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj imię i nazwisko");
        dane=(br.readLine());

    }

    public void zapisz_dane_do_pliku() throws IOException{
        System.out.println("Zapisujemy dane do pliku .txt");
        FileWriter fw = new FileWriter("dane.txt");
        fw.write(dane);
        fw.close();

    }
    public void czytaj_dane_z_pliku() throws IOException{
        System.out.println("Odczytujemy dane z pliku dane.txt");
        System.out.println("");
        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((dane1 = br.readLine()) !=null){
            System.out.println(dane1);
        }
        fr.close();


    }
}
