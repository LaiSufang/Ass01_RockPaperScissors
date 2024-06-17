import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;
        String playerAMove = "";
        String playerBMove = "";
        boolean isValidInput = false;
        boolean isContinue = false;

        do {
            do {
                System.out.print("Player A: Please enter a move [R, P, S or r, p, s]: ");
                userInput = in.nextLine();
                if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                    playerAMove = userInput;
                    isValidInput = true; // because we got a valid move  we can end the loop
                } else {
                    System.out.println(userInput + " is not a valid move!");
                }
            } while (!isValidInput);

            isValidInput = false;

            do {
                System.out.print("Player B: Please enter a move [R, P, S or r, p, s]: ");
                userInput = in.nextLine();
                if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                    playerBMove = userInput;
                    isValidInput = true; // because we got a valid move  we can end the loop
                } else {
                    System.out.println(userInput + " is not a valid move!");
                }
            } while (!isValidInput);

            if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock! It’s a Tie!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It’s a Tie!");
                } else {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            } else {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors! It’s a Tie!");
                }
            }

            do {
                System.out.println("Do you want to continue [Y/N]: ");
                userInput = in.nextLine();
                if (userInput.equalsIgnoreCase("Y")) {
                    isContinue = true;
                    isValidInput = true;
                } else if (userInput.equalsIgnoreCase("N")) {
                    isContinue = false;
                    isValidInput = true;
                } else {
                    System.out.println(userInput + " is not a valid option!");
                    System.out.println("Please enter Y or N!");
                }
            } while (!isValidInput);

            isValidInput = false;

        } while (isContinue);
    }
}