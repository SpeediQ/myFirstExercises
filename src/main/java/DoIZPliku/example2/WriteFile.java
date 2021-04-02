package DoIZPliku.example2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeExample(String text) throws IOException {

        File file = new File("WriteExample.txt");

        FileWriter writer = new FileWriter(file);

        writer.write(text);
        writer.close();
    }


}
