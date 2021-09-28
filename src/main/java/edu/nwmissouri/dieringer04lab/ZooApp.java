package edu.nwmissouri.dieringer04lab;

import java.util.Scanner;

/**
 *
 * @author Alexander Dieringer
 */
public class ZooApp {

    private static final String ZOO_NAME = "Dieringer 542 Zoo";

    public static void main(String[] args) {
        // Define prompts to the user
        String exitStatement = "Thank you for coming to the " + ZOO_NAME + "!";

        // Prep scanner for user input
        Scanner scan = new Scanner(System.in);
        // Make variable for user input
        String userInput;

        // Define names for our zoo animals
        String[] aardvarkNames = {"Ann", "Abe", "Axelotyl, first of his Name"};
        String[] griffinNames = {"Griff", "George",
            "Gus, Lord of the Skies and Defender of the White Mountain"};
        
        // Prompt welcome message
        int nameLength = "Alexander".length();
        for (int i = 0; i < nameLength; i++) {
            System.out.println("Welcome to the" + ZOO_NAME + "!");
        }
        System.out.print("\n");

        // Let the user know how to exit our loop
        System.out.println("Press Q at any time to exit the program");
        // Define program loop checkpoint
        boolean quitProgram = false;
        // Define nested loop checkpoint
        boolean checkAnimals;

        // Begin our loop
        while (!quitProgram) {
            // Make sure we have a definitive value for the check
            checkAnimals = false;

            // Prompt the user about seeing the animals
            System.out.println("Would you like to see an animal (y/n):");
            userInput = scan.nextLine();

            switch (userInput.toLowerCase()) {
                case "y":
                    checkAnimals = true;
                    break;
                case "n":
                    System.out.println(exitStatement);
                    quitProgram = true;
                    break;
                case "q":
                    System.out.println(exitStatement);
                    quitProgram = true;
                    break;
                default:
                    System.out.println("Could not understand input: "
                            + userInput + "\n");
                    break;
            }

            while (checkAnimals) {
                System.out.println("What type of animal would you like to see (enter number): ");
                System.out.println("\t1. Aardvarks");
                System.out.println("\t2. Griffins");
                userInput = scan.nextLine();

                switch (userInput.toLowerCase()) {
                    case "1":
                        for(int j=0; j < 3; j++) {
                            Aardvark aard = new Aardvark(aardvarkNames[j]);
                            aard.callAllMethods();
                            System.out.print("\n");
                        }
                        break;

                    case "2":
                        for(int k=0; k < 3; k++) {
                            Griffin grif = new Griffin(griffinNames[k]);
                            grif.callAllMethods();
                            System.out.print("\n");
                        }
                        break;

                    case "q":
                        System.out.println(exitStatement);
                        checkAnimals = false;
                        quitProgram = true;
                        break;

                    default:
                        System.out.println("Could not understand input: "
                                + userInput + "\n");
                        checkAnimals = false;
                        break;
                }
            }
        }
    }

}
