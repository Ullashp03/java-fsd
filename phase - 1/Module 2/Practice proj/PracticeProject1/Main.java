package PracticeProject1;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("file.txt");

            // Writing to the file
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("The text here is :Hello, world!");
            fileWriter.close();

            // Reading from the file
            FileReader fileReader = new FileReader(file);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            fileReader.close();

            // Appending to the file
            FileWriter fileWriter2 = new FileWriter(file, true);
            fileWriter2.write("\nAppended line");
            fileWriter2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}