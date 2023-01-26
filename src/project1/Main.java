package project1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void HelloMenu()
    {
        System.out.println();
        System.out.println("Welcome To LockedMe.");
        System.out.println("My name is Nana Brown.");
        System.out.println("I will be assisting you today.");
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("You can choose one of the options below.");
        System.out.println();
        System.out.println("1. Display Files");
        System.out.println("2. File Management");
        System.out.println("3. Exit Store");
    }

    public static void displaySecondMenu()
    {
        System.out.println();
        System.out.println("1. Add File");
        System.out.println("2. Delete File");
        System.out.println("3. Search Files");
        System.out.println("4. Main Menu");

    }

    public static void ByeMenu()
    {

        System.out.println();
        System.out.println("Exiting Store...");
        System.out.println("Hope to see you back soon.");

    }

    public static void main(String[] args) throws IOException {

        Scanner act = new Scanner(System.in);

        HelloMenu();

        while(true) {
            displayMenu();
            System.out.println();

            int choice;

            while (true)
                try {
                    choice = act.nextInt();
                    break;
                } catch (InputMismatchException err) {
                    System.out.println("Invalid input.");
                    System.out.println("Please enter a valid option");
                    act.next();
                }

            switch (choice) {
                case 1 -> {
                    System.out.println();
                    Services.listAllfiles();
                }
                case 2 -> {
                    Integer exit = 0;
                    while (exit.equals(0)) {

                        displaySecondMenu();
                        System.out.println();

                        int choice1;

                        while (true)
                            try {
                                choice1 = act.nextInt();
                                break;
                            } catch (InputMismatchException err1) {
                                System.out.println("Invalid input.");
                                System.out.println("Please enter a valid option");
                                act.next();
                            }


                        switch (choice1) {
                            case 1 -> {
                                System.out.println();
                                System.out.println("Input Filename");
                                String added = act.next();
                                System.out.println();
                                Services.addfile(added);
                                exit = 0;
                            }
                            case 2 -> {
                                System.out.println();
                                System.out.println("Input Filename");
                                String deleted = act.next();
                                System.out.println();
                                Services.deletefile(deleted);
                                exit = 0;
                            }
                            case 3 -> {
                                System.out.println();
                                System.out.println("Input Filename");
                                String searched = act.next();
                                System.out.println();
                                Services.searchfile(searched);
                                exit = 0;
                            }
                            case 4 -> {
                                System.out.println();
                                System.out.println("Going to the Main page");
                                exit = 1;
                            }
                        }
                    }
                }
                case 3 -> {
                    ByeMenu();
                    System.exit(0);
                }
            }

        }
    }

}