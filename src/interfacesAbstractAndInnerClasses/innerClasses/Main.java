package interfacesAbstractAndInnerClasses.innerClasses;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
    }
}
