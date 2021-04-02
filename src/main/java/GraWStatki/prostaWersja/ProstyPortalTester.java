package GraWStatki.prostaWersja;

public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortal wit = new ProstyPortal();

        int[] polozenia = {2,3,4};
        wit.setPolaPolozenia(polozenia);

        String wybranePola = "2";
        String wynik = wit.sprawdz(wybranePola);

//        String wynikTestu = "niepowodzenie";
//        if (wynik.equals("trafiony")){
//            wynikTestu="Zakończony pomyślnie";
//        }
//        System.out.println(wynikTestu);

    }
}
