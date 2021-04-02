package test1.patternCwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {
    private final static String METEO_STRING = "Poniedzialek;15C wiatr wschod mocny\n" +
            "Wtorek}16C wiatr zachod mocny\n" +
            "Sroda[15C wiatr brak brak\n" +
            "Czwartek!9C wiatr polnoc sredni\n";

    public void run() {
        int summ=0;
        Pattern pattern1 = Pattern.compile("(\\d{1,2})C");
        Matcher matcher1 = pattern1.matcher(METEO_STRING);
        while (matcher1.find()){
            summ+=Integer.parseInt(matcher1.group(1));
        }
        System.out.println(summ);

//        double ssum= Double.parseDouble(matcher1.group(1));
//        double sum = 0, ilosc = 0;
//        while (matcher1.find()) {
//            ilosc++;
//            sum += Double.parseDouble(matcher1.group(1));
//        }
//        System.out.println("Suma: " + sum + "C");
//        System.out.println("Średnia: " + sum / ilosc + "C");



    }
}
