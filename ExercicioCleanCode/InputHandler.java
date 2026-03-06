package ExercicioCleanCode;

import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                double value = Double.parseDouble(input);
                if (value <= 0) {
                    System.out.println("Value must be positive! Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    public static void close() {
        scanner.close();
    }
}
