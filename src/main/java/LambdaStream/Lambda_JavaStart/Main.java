package LambdaStream.Lambda_JavaStart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    private void run() {
        List<String> names = new ArrayList<>();
        names.add("Genowefa");
        names.add("Dotota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

        names = filter(names, name-> name.endsWith("a"));

        modifyAndDisplay(names, n -> n + "!");



    }

    private List<String> filter(List<String> input, Filter filter) {
        List<String> resultList = new ArrayList<>();
        for (String name : input) {
            if (filter.filter(name)) {
                resultList.add(name);
            }
        }
        return resultList;
    }

    private void modifyAndDisplay(List<String> names, Modifier modifier) {
        List<String> modifiedNames = new ArrayList<>();


        for (String name : names) {
            String modifiedName = modify(name, modifier);
            modifiedNames.add(modifiedName);
        }
        System.out.println(modifiedNames);
    }

    private String modify(String string, Modifier modifier) {
        return modifier.modify(string);
    }
}
//        Random random = new Random();
//        for (String name : names) {
//            String modifiedName= name +" "+ random.nextInt(11);
//            modifiedNames.add(modifiedName);
//
//        }
//        System.out.println(modifiedNames);