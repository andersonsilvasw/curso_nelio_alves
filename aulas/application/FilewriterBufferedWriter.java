package cursonelioalves.aulas.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "good night"};

        String path = "c:\\temp\\aulagithubnelioalves\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
