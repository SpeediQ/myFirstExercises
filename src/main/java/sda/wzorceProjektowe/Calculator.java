package sda.wzorceProjektowe;

import sda.wzorceProjektowe.singleton.MenuOne;

public class Calculator {
    public static void main(String[] args) {
        MenuOne.getInstance().display();
        System.out.println(MenuOne.getInstance().select());
    }
}
