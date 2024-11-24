package Exercises;

import java.lang.Math;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //calculate sum
        double sum = num1 + num2;
        //using abs to find the difference
        double difference = Math.abs(num1 - num2);
        //calculate product
        double product = num1 * num2;

        //handle the 0 case
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.printf("Quotient: %.2f\n", quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);

        scanner.close();
    }
}