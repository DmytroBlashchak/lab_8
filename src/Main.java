import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, It's project 8, please enter a mode you want to use here. If you don`t know which modes are available, just type 2 to get a 'Help'");
            int mode = scanner.nextInt();

            scanner.nextLine();

            try {
                mainObject.cases(mode);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid mode number.");
            }
        }
    }

    private void cases(int mode) {
        switch (mode) {
            case 1:
                RandomNumberWriter numberWriter = new RandomNumberWriter();
                System.out.println("Enter how you want to name the file: ");
                File fileName = new File(scr.nextLine());
                System.out.println("Enter minimal range of random numbers: ");
                int minRange = Integer.parseInt(scr.nextLine());
                System.out.println("Enter maximal range of random numbers: ");
                int maxRange = Integer.parseInt(scr.nextLine());
                System.out.println("Enter amount of random numbers you want to create: ");
                int count = Integer.parseInt(scr.nextLine());


                numberWriter.userInput(minRange, maxRange);
                numberWriter.numberRandomizer(fileName, minRange, maxRange, count);
                numberWriter.infoReader(fileName);
                return;
            case 2: // HELP
                System.out.println("By typing '1' you will access the first and only task of this project!" +
                        " If you type '2', you will be dragged here again (Help)"+"if you type '2', you will stop the program");
           return;
            case 3:
            System.out.println("Good bye, see you soon!");
            System.exit(0);
            return;
        }
    }
}
