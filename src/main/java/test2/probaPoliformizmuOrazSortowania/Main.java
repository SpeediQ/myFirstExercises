package test2.probaPoliformizmuOrazSortowania;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new JavaDeveloper("Marcin", 28, 7000);
        employees[1] = new Trader("Łukasz", 30,3000);
        employees[2] = new Trader("Karolina", 24, 4500);

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
            employee.description();
            employee.aboutMyWork();
        }

    }
}
