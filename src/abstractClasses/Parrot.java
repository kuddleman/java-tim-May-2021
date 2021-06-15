package abstractClasses;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Parrot is breathing");
    }


}
