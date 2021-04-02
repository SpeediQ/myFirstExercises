package sda.wzorceProjektowe.command;

public class SumOfDemo {
    public static void main(String[] args) {
        SumOf suma = new SumOf(10,3);

        System.out.println(suma);
        suma.execute();
        System.out.println(suma);
        suma.execute();
        System.out.println(suma);
        suma.undo();
        System.out.println(suma);
    }
}
