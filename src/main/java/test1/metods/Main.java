package test1.metods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Persons person1 = new Persons("Marcin", "Kowalczyk", 28);
//        Persons person2 = new Persons("Katarzyna", "Kowalczyk", 30);
//        Persons person3 = new Persons("Konrad", "Kowalczyk", 24);
//
//        List<Persons> persons = new ArrayList<>();
//        persons.add(person1);
//        persons.add(person2);
//        persons.add(person3);
//
//        for (Persons person : persons) {
//            System.out.println(person);
//        }


//          Działająca wersja
//        Persons dodanaOsoba = dodawanieOsoby();
//        Queue queue = new Queue();
//        queue.addNewParso(dodanaOsoba);
//        queue.showAllList();

        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String choice;


        do {
            System.out.println("\nMenu:\na- dodaj os\nb- pokaż listę\nc- same kobiety z listy\nd- sami mężczyźcni\ne- osoby pełnoletnie\nf- osoby małoletnie\nq- wyjście z programu");
            choice = scanner.nextLine();

            if ("a".equals(choice)){
                Persons dodanaOsoba = dodawanieOsoby();
                queue.addNewParso(dodanaOsoba);
                System.out.println("Osobę dodano!");
            }
            else if ("b".equals(choice)){
                System.out.println("Pełna Lista");
                queue.showAllList();
            }
            else if ("c".equals(choice)){
                System.out.println("Same kobiety z listy");
                queue.filterWoman();
            }
            else if ("d".equals(choice)){
                System.out.println("Sami mężczyźni z listy");
                queue.filterMen();
            }
            else if ("e".equals(choice)){
                System.out.println("Osoby pełnoletnie");
                queue.filterForAge();
            }
            else if ("f".equals(choice)){
                System.out.println("Osoby małoletnie");
                queue.filterNotForAge();
            }

        }while (!"q".equals(choice));
    }

    private static Persons dodawanieOsoby() {
        String name, surname;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("imię:");
        name = sc.nextLine();
        System.out.println("nazwisko:");
        surname = sc.nextLine();
        System.out.println("wiek:");
        age = Integer.parseInt(sc.nextLine());

        Persons person = new Persons();
        person.setName(name);
        person.setSurname(surname);
        person.setAge(age);

        return person;
    }
}
