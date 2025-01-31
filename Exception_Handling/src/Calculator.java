import java.util.Scanner;

public class Calculator {

    public static double calculate(double a, double b, char operator) throws IllegalArgumentException {
        if (a > 100000 || b > 100000) {
            throw new IllegalArgumentException("Input cannot be greater than 100000");
        }

        if (operator == '*' && (a > 7000 || b > 7000)) {
            throw new IllegalArgumentException("Multiplication input cannot be greater than 7000");
        }

        if (operator == '/' && b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
