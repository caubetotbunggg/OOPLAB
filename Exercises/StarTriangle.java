package Exercises;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= n ; i++){
            for(int j = n-i; j > 0; j--){
                System.out.printf(" ");
            }
            for(int k = 1 ; k < 2 * i ; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
