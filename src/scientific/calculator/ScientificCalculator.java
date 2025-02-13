package scientific.calculator;

import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\nScientific Calculator");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square Root");
                System.out.println("6. Power");
                System.out.println("7. Sine");
                System.out.println("8. Cosine");
                System.out.println("9. Tangent");
                System.out.println("10. Exit");
                System.out.print("Choose an option: ");

                if (!scanner.hasNextInt()) { // Check if input is an integer
                    System.out.println("Invalid input! Please enter a number between 1 and 10.");
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                int choice = scanner.nextInt();

                double a, b;
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        if (b != 0) {
                            System.out.println("Result: " + (a / b));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        if (a >= 0) {
                            System.out.println("Result: " + Math.sqrt(a));
                        } else {
                            System.out.println("Error: Square root of a negative number is not allowed.");
                        }
                        break;
                    case 6:
                        System.out.print("Enter base and exponent: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result: " + Math.pow(a, b));
                        break;
                    case 7:
                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();
                        System.out.println("Result: " + Math.sin(Math.toRadians(a)));
                        break;
                    case 8:
                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();
                        System.out.println("Result: " + Math.cos(Math.toRadians(a)));
                        break;
                    case 9:
                        System.out.print("Enter angle in degrees: ");
                        a = scanner.nextDouble();
                        System.out.println("Result: " + Math.tan(Math.toRadians(a)));
                        break;
                    case 10:
                        running = false;
                        System.out.println("Exiting calculator...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 10.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
    }
}
