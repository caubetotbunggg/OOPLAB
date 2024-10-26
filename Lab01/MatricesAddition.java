package Exercises;

import java.util.Scanner;

public class MatricesAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrices size: ");
        int n = scanner.nextInt();
        int row = n;
        int col = n;

        int[][] mtr1 = new int[row][col];
        int[][] mtr2 = new int[row][col];
        int[][] sumMtr = new int[row][col];

        System.out.println("Enter first matrice number (left to right up to down): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter next matrice number (left to right up to down): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtr2[i][j] = scanner.nextInt();
            }
        }

        //calculate matrice sum
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMtr[i][j] = mtr1[i][j] + mtr2[i][j];
            }
        }

        //print out the solution
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumMtr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}