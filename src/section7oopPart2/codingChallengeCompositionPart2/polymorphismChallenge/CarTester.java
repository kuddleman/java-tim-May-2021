package section7oopPart2.codingChallengeCompositionPart2.polymorphismChallenge;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("mycar", true, 4, 4);
        Car car2 = new Car("car2", 4);

        //System.out.println(car2.getEngine());


        Toyota toyota1 = new Toyota("myToyota", true, 4, 4);
        toyota1.brake();

    }
}
