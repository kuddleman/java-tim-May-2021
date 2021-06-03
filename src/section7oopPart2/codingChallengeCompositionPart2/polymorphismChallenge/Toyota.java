package section7oopPart2.codingChallengeCompositionPart2.polymorphismChallenge;

public class Toyota extends Car {
    public Toyota(String name, boolean engine, int cylinders, int wheels) {
        super(name, engine, cylinders, wheels);
    }

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public void startEngine() {
        System.out.println("TOYOTA engine is starting!");
    }
    @Override
    public void accelerate() {
        System.out.println("TOYOTA is accelerating!");
    }
    @Override
    public void brake() {
        System.out.println("TOYOTA is braking!");
    }
}
