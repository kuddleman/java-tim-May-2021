package section7oopPart2.codingChallengeCompositionPart2.polymorphismChallenge;

public class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;



    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

    }



    public String getName(){
        return name;
    }
    public boolean getEngine() {
        return engine;
    }
    public int getCylinders() {
        return cylinders;
    }
    public int getWheels() {
        return wheels;
    }
    public void startEngine() {
        System.out.println("CAR engine is starting!");
    }
    public void accelerate() {
        System.out.println("CAR is accelerating!");
    }
    public void brake() {
        System.out.println("CAR is braking!");
    }
}
