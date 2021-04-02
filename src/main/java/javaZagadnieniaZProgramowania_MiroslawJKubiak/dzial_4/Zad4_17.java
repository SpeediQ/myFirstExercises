package javaZagadnieniaZProgramowania_MiroslawJKubiak.dzial_4;


import java.util.ArrayList;
import java.util.Collections;

public class Zad4_17 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(20);
        lista.add(51);
        lista.add(-72);
        lista.add(4);
        lista.add(14);
        lista.add(-4);

        System.out.println("Elementy nieposortowane: ");

        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }
        System.out.println("");

        Collections.sort(lista); // sortowanie elementów!!!!!!!!!!!1

        System.out.println("Posortowane elementy: ");

        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }
        System.out.println();
        lista.remove(1); // usunięto drugi element z listy
        System.out.println("Usunięto drugi element z listy!");

        lista.add(10);

        System.out.println("Elementy nieposortowane po usunięciu i dodaniu nowego: ");
        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }
        Collections.sort(lista);


        System.out.println("\nElementy po ponownym sortowaniu: ");
        for (int i = 0; i < lista.size(); i++) {
            if (i<lista.size()-1){
                System.out.print(lista.get(i)+", ");
            }else{
                System.out.println(lista.get(i)+". ");
            }
        }

    }
}
