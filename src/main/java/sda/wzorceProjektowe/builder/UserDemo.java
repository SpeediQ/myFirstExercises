package sda.wzorceProjektowe.builder;

import java.time.LocalDate;

public class UserDemo {
    public static void main(String[] args) {
        User admin = User.builder().email("ola.ol.pl").name("ola").birthDate(LocalDate.of(2000,10,11)).build();
        System.out.println(admin);
    }
}
