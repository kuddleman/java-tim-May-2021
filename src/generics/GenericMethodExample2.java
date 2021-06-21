package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodExample2 {
    public static void main(String[] args) {

    }

    public static <K,V> Map<K,V> map(K key, V value) {
        Map<K,V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
}
