package DoIZPliku.example1;

public class Car {
    String marka,wlasciciel;
    int konie;

    public Car(String marka, String wlasciciel, int konie) {
        this.marka = marka;
        this.wlasciciel = wlasciciel;
        this.konie = konie;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", wlasciciel='" + wlasciciel + '\'' +
                ", konie=" + konie +
                '}';
    }
}
