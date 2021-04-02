package interfaceExample.javastart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String text){
        try{
            File file = new File("InterfaceExampleWriteFile.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException exception){
            exception.getMessage();
        }

    }
}
