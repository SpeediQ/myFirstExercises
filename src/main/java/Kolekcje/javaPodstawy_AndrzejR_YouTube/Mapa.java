package Kolekcje.javaPodstawy_AndrzejR_YouTube;

import java.util.*;
import java.util.stream.Stream;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "dwaIPół");
        map.put(4, "dwa");

        for (Map.Entry<Integer,String> m: map.entrySet()){
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key+" "+value);

        }
//        System.out.println("\nPorównanie 2z4\n"+ map.get(2).equals(map.get(4))+"\n");
//        System.out.println("\nPorównanie 2z3\n"+ map.get(2).equals(map.get(3))+"\n");
//        System.out.println(map.values());
//        map.clear();
//        System.out.println(map.values());

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Pierwsza", 10);
        mapa.put("Pierwsza", 20);
        mapa.put("Pierwsza", 30);
        mapa.put("Druga",30);
        System.out.println(mapa);

        List<Integer> list2 = Arrays.asList(10,20,30,50,40);
        Map<String, List<Integer>> mapa2 = new HashMap<>();
        mapa2.put("Pierwsza", (List<Integer>) list2);
        mapa2.put("Druga", (List<Integer>)Arrays.asList(10,20,30,50,40,60,41));
        System.out.println(mapa2);



    }
}
