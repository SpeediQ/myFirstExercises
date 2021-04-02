package DoIZPliku.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    public void read() throws FileNotFoundException {

        List<Car> lista = new ArrayList<>();

        StringBuffer stringBuffer2 = new StringBuffer();


        File file = new File("ala.txt");
        Scanner in = new Scanner(file);


        while (in.hasNextLine()) {
            stringBuffer2.append(in.nextLine() + "\n");
//            String zdanie = in.nextLine();
        }
        System.out.println(stringBuffer2);


        Pattern pattern2 = Pattern.compile("(\\w+) \\W (\\w+) \\W (\\w+)");
        Matcher matcher2 = pattern2.matcher(stringBuffer2);




        String marka = null, wlasciciel = null;
        String konie = null;

        int summ = 0;
        while (matcher2.find()) {
            summ++;

            lista.add(new Car(matcher2.group(1),matcher2.group(2),Integer.parseInt(matcher2.group(3))));

        }

        lista.forEach(System.out::println);

    }

    public void createBuffer() {
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("Jestem najlepszy");
//        stringBuffer.append("!");
//        System.out.println(stringBuffer);
//        stringBuffer.replace(16,17,"?");
//        System.out.println(stringBuffer.length());
//        System.out.println(stringBuffer);

    }
}
