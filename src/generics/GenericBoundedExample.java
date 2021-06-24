package generics;

public class GenericBoundedExample {
    public static void main(String[] args) {
        inspect(100);

    }
    public static <T extends Number> void inspect(T t) {
        System.out.println("T type is: " + t.getClass().getName());
    }
}
