package test1;

import java.util.Map;

public class BazaKlientow {
    String firstName, lastName;

    public BazaKlientow(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void client(){
        System.out.println("Imię: "+firstName);
        System.out.println("Nazwisko: "+lastName+"\n");
    }


}
