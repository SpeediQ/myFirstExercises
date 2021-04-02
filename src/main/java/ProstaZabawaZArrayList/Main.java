package ProstaZabawaZArrayList;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Employee marcinK = new Employee("Marcin", "Kowalczyk",27, "Katowice", Gender.MAN);
        Employee jurek = new Employee("Jurek", "Owsiak", 38,"Katowice", Gender.MAN);
        Employee michał = new Employee("Michał", "Walczak",19, "Sosnowiec", Gender.MAN);
        Employee marcinS = new Employee("Marcin", "Steć", 36,"Sosnowiec", Gender.MAN);
        Employee witold = new Employee("Witold", "Drzymała",47, "Będzin", Gender.MAN);
        Employee katarzyna = new Employee("Katarzyna", "Pilch",27, "Katowice", Gender.WOMAN);

        List<Employee> lista = new ArrayList<Employee>();
        lista.add(marcinK);
        lista.add(jurek);
        lista.add(michał);
        lista.add(marcinS);
        lista.add(witold);
        lista.add(katarzyna);
        lista.add(new Employee("Mariusz","Sławik",56,"Sosnowiec",Gender.MAN));
        List<String> lista2 = new ArrayList<>();
        lista2.add("Ale ");
        lista2.add("ma ");
        lista2.add("kota");

        for (String ok :
                lista2) {
            System.out.println(ok);
        }


        int numberOfEmployees = lista.size();
        System.out.println("Ilość pracowników: " + numberOfEmployees);
        int number = 1;
        for (Employee pracownicy : lista) {
            System.out.println(number + ") " + pracownicy);
            number++;
        }

        System.out.println("\nOsoby mieszkające w Katowicach");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (lista.get(i).city.contains("Katowice")){
                System.out.println(lista.get(i).getName()+" "+lista.get(i).getLastName()+" ");
            }
        }
        System.out.println("\nOsoby mieszkające w Będzinie");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (lista.get(i).city.contains("Będzin")){
                System.out.println(lista.get(i).getName()+" "+lista.get(i).getLastName()+" ");
            }
        }
        System.out.println("\nOsoby mieszkające w Sosnowcu");
        for (int i = 0; i < numberOfEmployees; i++) {
            if (lista.get(i).city.contains("Sosnowiec")){
                System.out.println(lista.get(i).getName()+" "+lista.get(i).getLastName()+" ");
            }
        }







    }
}
