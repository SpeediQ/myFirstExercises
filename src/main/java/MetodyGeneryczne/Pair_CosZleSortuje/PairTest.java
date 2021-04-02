package MetodyGeneryczne.Pair_CosZleSortuje;


public class PairTest {
    public static void main(String[] args) {
        String[] words = {"jioioj","Alaaaa", "ma", "kotaaaaa", "i","psaa","okoi"};
        Pair <String> mm = ArrayAlg.minmax(words);
        System.out.println("min - "+mm.getFirst());
        System.out.println("max - "+mm.getSecound());

    }


}
