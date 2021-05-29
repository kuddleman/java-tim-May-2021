package section6oopPart1.challenge1;

public class Car extends Vehicle {


    public Car(String color, int modelYear, int numberDoors, boolean hasSunroof) {
        super(color, modelYear, numberDoors, hasSunroof);
    }

    @Override
    public void steering() {
        System.out.println("Car is Steering!");
    }

    @Override
    public void changingGears() {
        System.out.println("Car is Changing gears");
    }

    @Override
    public void moving() {
        System.out.println("Car is moving");
    }

}
