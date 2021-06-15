package interfacesAbstractAndInnerClasses.innerClasses;

class Outside {
    int a = 0;
    class Inside {
        int b = 5;
    }
}

public class innerSteller {
    public static void main(String[] args) {
        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println("Outside class variable a is " +
                o.a + "\n" + "Inside class variable b is " + i.b);

    }
}

