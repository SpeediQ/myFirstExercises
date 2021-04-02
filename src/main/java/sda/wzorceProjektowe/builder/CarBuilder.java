package sda.wzorceProjektowe.builder;

public class CarBuilder implements  ModelRequired, BrandRequired{
    private String model;
    private String registrationNumer;
    private String brand;
    private int horsePower;

    private CarBuilder() {
    }
    public static BrandRequired builder(){
        return new CarBuilder();
    }

    @Override
    public ModelRequired brand(String brand) {
        this.brand=brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model=model;
        return this;
    }
    public CarBuilder registrationNumber(String number){
        this.registrationNumer=number;
        return this;
    }
    public CarBuilder horsePower(int power){
        this.horsePower=power;
        return this;
    }
    public Car build(){
        return new Car(model,registrationNumer,brand,horsePower);
    }
}
