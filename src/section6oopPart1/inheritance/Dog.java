package section6oopPart1.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //unique method to a dog
    private void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog is walking");
    }
}
