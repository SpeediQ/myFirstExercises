package sda.wzorceProjektowe.builder;

public class Car {
    private String model;
    private String registrationNumer;
    private String brand;
    private int horsePower;

    public Car(String model, String registrationNumer, String brand, int horsePower) {
        this.model = model;
        this.registrationNumer = registrationNumer;
        this.brand = brand;
        this.horsePower = horsePower;
    }
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String model;
        private String registrationNumer;
        private String brand;
        private int horsePower;

        public Builder() {
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder registrationNumer(String registrationNumer) {
            this.registrationNumer = registrationNumer;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder horsePower(int power) {
            this.horsePower = power;
            return this;
        }

        public Car build() {
            return new Car(model, registrationNumer, brand, horsePower);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", registrationNumer='" + registrationNumer + '\'' +
                ", brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
