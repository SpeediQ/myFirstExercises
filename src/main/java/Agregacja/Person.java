package Agregacja;

public class Person {

       private String first_name;
       private String last_name;
       private Address address;

    public Person(String first_name, String last_name, Address address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }

    @Override
    public String toString() {
        return first_name+" "+last_name+", "+address.getStreet()+" "+address.getCity();
    }
}

