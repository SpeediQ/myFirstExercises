package test2.klasaAnonimowa;

public class Main {
    public static void main(String[] args) {
        Przycisk przycisk1 = new Przycisk();

//        Interfejs interfejs = new Interfejs() {
//            @Override
//            public void akcja() {
//                System.out.println("tutaj");
//            }
//        };
//
//        przycisk1.dodajAkcje(interfejs);
//
//        przycisk1.dodajAkcje(new Interfejs() {
//            @Override
//            public void akcja() {
//                System.out.println("tutaj1");
//            }
//        });

//        Interfejs interfejs = new Interfejs() {
//            @Override
//            public void akcja() {
//                System.out.println("akcja przycisku");
//            }
//        };
//        przycisk1.dodajAkcje(interfejs);

        przycisk1.dodajAkcje(new Interfejs() {
            @Override
            public void akcja() {
                System.out.println("sprawdzenie sposobu");
            }
        });

    }
}
