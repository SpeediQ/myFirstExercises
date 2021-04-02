package sortowanie_babelkowe;

public class Main {
    public static void main(String[] args) {
        int[] liczby = new int[]{4,6,5,8,7};
        int temp;
        int counter=0;

        for (int i = 0; i < liczby.length - 1; i++) {
            boolean isSorted = true;
            for (int j = liczby.length - 1; j > i; j--) {
                counter++;
                if (liczby[j] < liczby[j - 1]) {
                    temp = liczby[j];
                    liczby[j] = liczby[j - 1];
                    liczby[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        for (int n : liczby) {
            System.out.print(n + " ");

        }
        System.out.println("\n"+counter);
    }
}