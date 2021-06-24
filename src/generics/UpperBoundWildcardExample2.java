package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcardExample2 {
    public static void main(String[] args) {
        List<Family> family = new ArrayList<>();
        List<Grandfather> gf = new ArrayList<>();
        List<Father> fa = new ArrayList<>();
        List<Son> son = new ArrayList<>();
        List<GrandSon> gs = new ArrayList<>();
        familyTree(family);

    }
    public static void familyTree(List<? extends Family> list) {
        for (Family f : list) {
            System.out.println("Class is ." + f.getClass().getName());
        }

    }
}

class Family {}
class Grandfather extends Family {}
class Father extends Grandfather{
    String name;

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Son extends Father{}
class GrandSon extends Son{}
