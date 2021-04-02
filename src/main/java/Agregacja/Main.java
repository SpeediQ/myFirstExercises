package Agregacja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(
          new Person("Marcin", "Kowalczyk", new Address("ŻwirkiiW" , "Katowice"))
        );

        System.out.println(list);

    }
}
