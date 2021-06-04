package arraysListsBoxing.arrays.minElementChallenge;
import java.util.*;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int myInts = readInteger();
        //System.out.println(myInts);
        int[] myNewArray = readElements(myInts);
        //System.out.println(Arrays.toString(myNewArray));
        int myMinVal = findMin(myNewArray);
        System.out.println(myMinVal);

    }
    public static int readInteger(){

        System.out.println("Please enter the number of integers: ");
        return scanner.nextInt();
    }
    public static int[] readElements(int numOfElem) {
        int[] array = new int[numOfElem];

        System.out.println("Now enter " + numOfElem + " integers: ");
        for(int i = 0; i < numOfElem; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] arr){
        int minVal = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
