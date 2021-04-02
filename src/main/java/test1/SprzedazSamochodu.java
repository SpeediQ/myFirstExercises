package test1;

public class SprzedazSamochodu extends KupnoSamochodu {
    double cenaSprzedazy;

    public SprzedazSamochodu(String nazwaSamochodu, String rocznikSamochodu, double cenaKupnaSamochodu, double cenaSprzedazy) {
        super(nazwaSamochodu, rocznikSamochodu, cenaKupnaSamochodu);
        this.cenaSprzedazy = cenaSprzedazy;
    }

}
