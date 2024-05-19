import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberWriter {
    public void userInput(int minRange, int maxRange) {
        if (minRange >= maxRange) {
            System.out.println("Error: min range should be less than max range.");
        }
    }

    public void numberRandomizer(File fileName, int minRange, int maxRange, int count) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\shotf\\Lab_8\\" + fileName + ".txt"));
            writer.write("Your min range: " + minRange + ". Your max range: " + maxRange + "\n");

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                writer.write(randomNumber + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void infoReader(File fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shotf\\Lab_8\\" + fileName + ".txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
