import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput;

        do {
            System.out.print("Guess the number (1-10): ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Consume invalid input
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is correct!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }
    }
}
