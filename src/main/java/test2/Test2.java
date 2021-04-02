package test2;

public class Test2 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int p2 = 0, p3 = 0, pl2 = 0, pl3 = 0;

        for (int i : tab1) {
            if (i % 2 == 0) {
                pl2++;
            }
            if (i % 3 == 0) {
                pl3++;
            }
        }
        int[] tab2 = new int[pl2];
        int[] tab3 = new int[pl3];
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] % 2 == 0) {
                tab2[p2]=tab1[i];
                p2++;
            }
            if (tab1[i] % 3 == 0) {
                tab3[p3]=tab1[i];
                p3++;
            }
        }
        System.out.println("Podzielne przez 2");
        for (int i : tab2) {
            System.out.println(i);
        }
        System.out.println("Podzielne przez 3");
        for (int i : tab3) {
            System.out.println(i);
        }

    }

}
