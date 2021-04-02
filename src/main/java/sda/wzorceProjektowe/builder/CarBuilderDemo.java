package sda.wzorceProjektowe.builder;

public class CarBuilderDemo {
    public static void main(String[] args) {
        //Poprawne wykorzystanie buildera wbudowanego w klase Car
        Car maluch = Car.builder().brand("FSM").horsePower(20).build();

        Car kaszlak = new Car.Builder().brand("FSO").model("AAA").build();
        System.out.println(maluch);
        System.out.println(kaszlak);

        //Prezentacja klasy CarBuilder
        Car auto = CarBuilder.builder().brand("dsa").model("dsads").build();
        System.out.println(auto);

    }
}
