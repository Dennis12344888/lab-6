import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0, efficiency = 0, price = 0, costPer100Miles, distance;

        boolean validInput;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Consume invalid input
            }
        } while (!validInput);

        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Consume invalid input
            }
        } while (!validInput);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Consume invalid input
            }
        } while (!validInput);

        costPer100Miles = (price / efficiency) * 100;
        distance = gallons * efficiency;
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go: " + distance + " miles");
    }
}
