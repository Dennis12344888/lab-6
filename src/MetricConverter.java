import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = 0, miles, feet, inches;
        boolean validInput;

        do {
            System.out.print("Enter a measurement in meters: ");
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Consume invalid input
            }
        } while (!validInput);

        miles = meters * 0.000621371;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
