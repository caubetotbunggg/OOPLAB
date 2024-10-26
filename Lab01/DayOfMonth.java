package Exercises;

import java.util.Scanner;

public class DayOfMonth {

    // Convert a given month string or number to an integer representation
    public static int convertMonth(String month) {
        switch (month) {
            case "January": case "Jan": case "Jan.": case "1": return 1;
            case "February": case "Feb": case "Feb.": case "2": return 2;
            case "March": case "Mar": case "Mar.": case "3": return 3;
            case "April": case "Apr": case "Apr.": case "4": return 4;
            case "May": case "5": return 5;
            case "June": case "Jun": case "6": return 6;
            case "July": case "Jul": case "7": return 7;
            case "August": case "Aug": case "Aug.": case "8": return 8;
            case "September": case "Sep": case "Sep.": case "9": return 9;
            case "October": case "Oct": case "Oct.": case "10": return 10;
            case "November": case "Nov": case "Nov.": case "11": return 11;
            case "December": case "Dec": case "Dec.": case "12": return 12;
            default: return -1; // Invalid month input
        }
    }

    // Convert a year string to an integer and validate it
    public static int convertYear(String yearStr) {
        int year = Integer.parseInt(yearStr); // Convert to integer as required
        if (year >= 0) {
            return year;
        } else {
            return -1; // Invalid year input
        }
    }

    // Get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30; 
            case 2: return calculateLeapYearDays(year); // Handle February for leap years
            default: return 0; // Invalid month
        }
    }

    // Determine the number of days in February based on whether the year is a leap year
    public static int calculateLeapYearDays(int year) {
        // Leap year: divisible by 4 and not divisible by 100, unless also divisible by 400
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return 29;
        } else {
            return 28;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) { // Infinite loop to allow repeated inputs
            System.out.print("Enter the month: ");
            String inputMonth = scanner.nextLine();

            System.out.print("Enter the year: ");
            String inputYear = scanner.nextLine();

            int month = convertMonth(inputMonth);
            int year = convertYear(inputYear);

            // If the inputs are invalid, prompt the user to re-enter
            if (month == -1 || year == -1) {
                System.out.println("Invalid input, please try again.");
                continue; // Continue to the next iteration of the loop
            }

            int days = getDaysInMonth(month, year);
            System.out.println("The number of days in the month is: " + days);
            break; // Exit the loop after displaying the number of days
        }

        scanner.close();
    }
}
