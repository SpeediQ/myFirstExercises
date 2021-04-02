package test1;

public class Main {
    public static void main(String[] args) {
        KupnoSamochodu kupnoSamochodu = new KupnoSamochodu("Fiat", "2016", 19000);
        System.out.println(kupnoSamochodu.nazwaSamochodu);
        System.out.println(kupnoSamochodu.rocznikSamochodu);
        System.out.println(kupnoSamochodu.cenaKupnaSamochodu);

        System.out.println("\nCena sprzedaży tego samochodu:");
        SprzedazSamochodu sprzedazSamochodu = new SprzedazSamochodu("Fiat", "2016",19000, 21000);
        System.out.println("Cena kupna "+sprzedazSamochodu.cenaKupnaSamochodu+", Cena sprzedaży "+sprzedazSamochodu.cenaSprzedazy);
        System.out.println();

        final double zysk = sprzedazSamochodu.cenaSprzedazy - sprzedazSamochodu.cenaKupnaSamochodu;

        System.out.println(zysk);

        System.out.println("Lista zainteresowanych:");
        BazaKlientow client1 = new BazaKlientow("Marcin", "Kowalczyk");
        BazaKlientow client2 = new BazaKlientow("Katarzyna", "Pilch");
        BazaKlientow client3 = new BazaKlientow("Dariusz", "Mach");

        System.out.printf("");

        client1.client();
        client2.client();
        client3.client();


    }

}
