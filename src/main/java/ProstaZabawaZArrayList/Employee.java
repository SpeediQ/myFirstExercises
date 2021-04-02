package ProstaZabawaZArrayList;

import java.util.Objects;

public class Employee {
    int age;
    String name;
    String lastName;
    String city;

    public Employee(String name, String lastName, int age, String city, Gender sex) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Pracownik " + name + " " + lastName + ", lat " + age + " zamieszkały w mieście " + city;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, lastName, city);
    }
}
