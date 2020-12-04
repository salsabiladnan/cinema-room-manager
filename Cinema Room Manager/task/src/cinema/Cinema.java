package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        
        int total_seats = rows * seats;
        int total_income = 0;
        if (total_seats <= 60) {
            total_income = total_seats * 10;
        } else {
            int first = rows / 2;
            int second = rows - first;
            total_income = first * seats * 10 + second * seats * 8;
        }
        System.out.println("Total income:");
        System.out.println("$" + total_income);
    }
}