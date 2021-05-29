package section6oopPart1.challenge1;

public class Vehicle {
    private String color;
    private int modelYear;
    private int numberDoors;
    private boolean hasSunroof;

    public Vehicle(String color, int modelYear, int numberDoors, boolean hasSunroof) {
        this.color = color;
        this.modelYear = modelYear;
        this.numberDoors = numberDoors;
        this.hasSunroof = hasSunroof;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public void steering() {
        System.out.println("Vehicle is Steering!");
    }

    public void changingGears() {
        System.out.println("Vehicle is Changing gears");
    }

    public void moving() {
        System.out.println("Vehicle is moving");
    }


}
