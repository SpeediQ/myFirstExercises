package test2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
//        run();



    }
    void testExtends(){
        run();
    }



    static void run(){
        List<String> names = Arrays.asList("Marcin", "Kasia", "Asia", "Zosia", "Wojtek");
        List<Person> person = names.stream()
                .filter(s -> s.endsWith("a"))
//                .sorted((o1, o2) -> o1.compareTo(o2))
                .map(string -> new Person(string, new Random().nextInt(21)))
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());


        System.out.println(person);
    }



}




class Person {
    String name, surname;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

