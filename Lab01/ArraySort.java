package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array num n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
          array[i] = scanner.nextInt();
        }
       
        scanner.close();

        //sorting the array
        Arrays.sort(array);

        //calculate array sum
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
        }

        //calculate average
        double average = (double) sum / n;

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
