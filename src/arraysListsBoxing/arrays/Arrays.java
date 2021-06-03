package arraysListsBoxing.arrays;

import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        int[] anotherArray = {1, 2, 3, 4, 5};

        int[] myIntegers = getIntegers(5);

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
