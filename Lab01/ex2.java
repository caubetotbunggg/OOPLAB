package Exercises;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select the type of equation to solve.
        System.out.println("Choose the type of equation to solve: ");
        System.out.println("1. First degree equation with one variable (ax + b = 0) ");
        System.out.println("2. First degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable ");
        int choice = scanner.nextInt();

        // Handle the user's choice and call the appropriate method.
        switch (choice) {
            case 1:
                solveCaseOne(scanner);
                break;
            case 2:
                solveCaseTwo(scanner);
                break;
            case 3:
                solveCaseThree(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }

    // Method to solve first-degree equation with one variable (ax + b = 0).
    private static void solveCaseOne(Scanner scanner) {
        System.out.println("input a: ");
        double num1 = scanner.nextDouble();

        if (num1 == 0) {
            System.out.println("a can't be 0!");
        } else {
            System.out.println("input b: ");
            double num2 = scanner.nextDouble();
            double ans = (-num2) / num1;
            System.out.printf("x: %.2f", ans);
        }
    }

    // Method to solve first-degree equations with two variables.
    private static void solveCaseTwo(Scanner scanner) {
        System.out.print("Input coefficient a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Input coefficient a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Input coefficient b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Input coefficient a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Input coefficient a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Input coefficient b2: ");
        double b2 = scanner.nextDouble();

        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        double D = a11 * a22 - a21 * a12;

        // Check the determinant to determine the nature of the solutions.
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("x1: " + x1 + ", x2: " + x2);
        }
    }

    // Method to solve second-degree equation with one variable (ax^2 + bx + c = 0).
    private static void solveCaseThree(Scanner scanner) {
        System.out.print("Input coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Input coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Input coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a can't be 0.");
        } else {
            double delta = b * b - 4 * a * c;
            // Check the discriminant to determine the nature of the roots.
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("The equation has no real roots");
            }
        }
    }
}
