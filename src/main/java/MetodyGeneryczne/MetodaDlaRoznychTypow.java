package MetodyGeneryczne;

public class MetodaDlaRoznychTypow {
    public static void main(String[] args) {
        Character[] chtab = {'a','b','c'};
        Integer[] itab={1,2,3,4};

        wypisz(chtab);
        System.out.println();
        wypisz(itab);


    }

    public static <T> void wypisz(T[] tablica) {
        for (T element : tablica) {
            System.out.print(element+" ");
        }
    }


}
