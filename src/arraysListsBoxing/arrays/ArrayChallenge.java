package arraysListsBoxing.arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] thisArray = getIntegers(4);
        printArray(thisArray);
        Arrays.sort(thisArray, Collections.reverseOrder());
        System.out.println("Here is the sorted list:");
        printArray(thisArray);


    }

    public static Integer[] getIntegers(int number) {
        System.out.println("Please enter " + number + " numbers.");
        Integer[] newArr = new Integer[number];

        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = scanner.nextInt();
        }
        return newArr;
    }

    public static void printArray(Integer[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Integer[] sortArray(Integer[] array) {
        Arrays.sort(array);
        return array;
    }
}
