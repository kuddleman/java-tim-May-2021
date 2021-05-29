package section6oopPart1.challenge1;

public class Toyota extends Car {

    private String countryOfOrigin;

    public Toyota(String color, int modelYear, int numberDoors,
                  boolean hasSunroof, String countryOfOrigin) {
        super(color, modelYear, numberDoors, hasSunroof);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public void steering() {
        System.out.println("Toyota is Steering!");
    }

    @Override
    public void changingGears() {
        System.out.println("Toyota is Changing gears");
    }

    @Override
    public void moving() {
        System.out.println("Toyota is moving");
    }

}
