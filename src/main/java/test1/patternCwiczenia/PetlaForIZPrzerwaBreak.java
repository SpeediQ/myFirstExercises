package test1.patternCwiczenia;

public class PetlaForIZPrzerwaBreak {
    public static void main(String[] args) {
        int a = 0;
        int wynik;
        for (int i = 0; i < 10; i++) {

            if (a == 5) {
                System.out.println("Warość a wyniosła: "+a+", pętla zostaje przerwana wcześniej");
                break;
            }

            System.out.println("Wartość a wynosi "+a);
            a++;
        }
    }
}
