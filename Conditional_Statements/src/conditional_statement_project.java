import java.util.Scanner;

public class conditional_statement_project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a problem to solve:");
            System.out.println("1. Print Star Pattern (For & While Loop)");
            System.out.println("2. Sum of First N Even Numbers (For & While Loop)");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Reverse Multiplication Table");
            System.out.println("5. Factorial Calculation (For & While Loop)");
            System.out.println("6. Sum of Multiplication Table");
            System.out.println("7. Do-While Loop Example");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printStarPattern();
                    printStarPatternWhile();
                    break;
                case 2:
                    sumOfEvenNumbers();
                    sumOfEvenNumbersWhile();
                    break;
                case 3:
                    multiplicationTable();
                    break;
                case 4:
                    reverseMultiplicationTable();
                    break;
                case 5:
                    factorialCalculation();
                    factorialCalculationWhile();
                    break;
                case 6:
                    sumOfMultiplicationTable();
                    break;
                case 7:
                    doWhileExample();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void printStarPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarPatternWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void sumOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i;
        }
        System.out.println("Sum of first " + n + " even numbers: " + sum);
    }

    public static void sumOfEvenNumbersWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0, i = 0;
        while (i < n) {
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum of first " + n + " even numbers: " + sum);
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void reverseMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for reverse multiplication table: ");
        int n = scanner.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void factorialCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static void factorialCalculationWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();
        int factorial = 1, i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public static void sumOfMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the sum of its multiplication table: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }
        System.out.println("Sum of multiplication table of " + n + " is " + sum);
    }

    public static void doWhileExample() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive number (enter -1 to exit): ");
            n = scanner.nextInt();
            if (n == -1) continue;
            System.out.println("You entered: " + n);
        } while (n != -1);
    }
}
