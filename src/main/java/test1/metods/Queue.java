package test1.metods;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<Persons> persons2 = new ArrayList<>();


    void addNewParso(Persons newPerson) {
        persons2.add(newPerson);
    }

    void showAllList() {
        persons2.forEach(System.out::println);
    }

    void filterWoman() {
        persons2.stream()
                .filter(n -> n.name.endsWith("a"))
                .forEach(System.out::println);

    }

    void filterMen() {
        persons2.stream()
                .filter(n -> !n.name.endsWith("a"))
                .forEach(System.out::println);

    }

    void filterForAge() {
        persons2.stream()
                .filter(n -> (n.age >= 18))
                .forEach(System.out::println);
    }

    void filterNotForAge() {
        persons2.stream()
                .filter(n -> (n.age < 18))
                .forEach(System.out::println);
    }


}
