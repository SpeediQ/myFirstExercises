package Kolekcje.javaPodstawy_AndrzejR_YouTube;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        list.add("cztery");
        list.add("pięć");
        list.add("sześć");
        list.add(5,"xxx");
        for (String content : list) {
            System.out.println(content);
        }
        System.out.println("Piąty element listy wyświetlam " +list.get(5));
list.remove("xxx");
        for (String content2 : list) {
            System.out.println(content2+" ");

        }
        System.out.println("\n");
        List<String> list2 = new ArrayList<>();
        list2.add("sprawdzenie");
        boolean spr1 = list2.contains("sprawdzenie");
        list2.remove("sprawdzenie");
        boolean spr2 = list2.contains("sprawdzenie");

        System.out.println(spr1);
        System.out.println(spr2);

        list2.add("wp");
        System.out.println("sprawdzam czy jest: "+list2.contains("wp"));
        list2.clear();
        boolean spr3 = list2.contains("wp");
        System.out.println(spr3);
        System.out.println("sprawdzam czy jest pusta po wyczyszczeniu "+list2.isEmpty());

//        int indexOdDwa = list.indexOf("xxx");
//        System.out.println(indexOdDwa);
    }


}
