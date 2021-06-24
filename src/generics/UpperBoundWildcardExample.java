package generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpperBoundWildcardExample {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        calculateSum(collect);
    }

    public static void calculateSum(List<? extends Number> list) {  //can use this class and its subclasses.
        double sum = 0;
        for(Number li : list) {
            sum = sum + li.doubleValue();
        }
        System.out.println("Total is :" + sum);

    }
}
