package generics;

public class GenericMethodExample1 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,5};
        printData(intArray);
        String[] strArray = new String[]{"hello", "yes", "no"};
        printData(strArray);

        // I cannot use primitive types in generics

    }
    public static <T> void printData(T [] t) {
        for(T data : t) {
            System.out.println(data);
        }
    }
}
