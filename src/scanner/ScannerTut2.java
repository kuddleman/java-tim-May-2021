package scanner;

import java.util.Scanner;

public class ScannerTut2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intNum;
        double doubleNum;

        System.out.println("Enter any integer or decimal:\n");
        if(input.hasNextInt()) {
            intNum = input.nextInt();
            System.out.println("You entered this integer: " + intNum);
        } else if(input.hasNextDouble()){
            doubleNum = input.nextDouble();
            System.out.println("You entered this decimal value: " + doubleNum);
        }
    }
}
