package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        // before Java 7
        List<String> li = new ArrayList<String>();

        //Java 7
        List<String> li1 = new ArrayList<>();
        // declaration         // implementation
        Shape<String> shape = new Shape<>("hello");
    }
}

class Shape<T>{
    private T t;

    public Shape(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
// Shape - Generic class
// <> - Diamond Operator which denotes the type inference
