package ciekawszeZadaniaZKursu.kolejkaDoLekarza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String option;
        Scanner scanner = new Scanner(System.in);
        HospitalQueue hospitalQueue = new HospitalQueue();
        System.out.println("Program służy do obsługi kolejki w przychodni lekarskiej. No to zaczynajmy... ;)");


        do {
            System.out.println("Menu:");
            System.out.println("A- dodaj pacjęta;\nB- przyjmij pacjęta;\nC- wyświetl ilość osób wczekających w kolejce;\nD- wyświetl osoby czekające w kolejce;");
            option = scanner.nextLine();
            option = option.toUpperCase();

            if ("A".equals(option)) {
                Patient patient = addPatient(scanner);
                hospitalQueue.addP(patient);

            } else if ("B".equals(option)) {
                System.out.println("Pacjęt został przyjęty "+hospitalQueue.nextPatient());

            } else if ("C".equals(option)) {
                hospitalQueue.count();
            }else if ("D".equals(option)) {
                hospitalQueue.showQueue();
            }


        } while (!"q".equals(option));


    }

    private static Patient addPatient(Scanner scanner) {
        System.out.println("Podaj imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj rok urodzenia: ");
        Integer yearOfBirth = Integer.valueOf(scanner.nextLine());
        System.out.println("Jakie dolegliwości: ");
        String disease=scanner.nextLine();


        Patient patient = new Patient();
        int currentYear, age;
        currentYear = 2019;
        age = currentYear - yearOfBirth;

        patient.setName(name);
        patient.setSurname(surname);
        patient.setAge(age);
        patient.setDisease(disease);



        return patient;
    }

}
