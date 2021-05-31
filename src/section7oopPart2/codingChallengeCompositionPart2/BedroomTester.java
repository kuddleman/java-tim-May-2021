package section7oopPart2.codingChallengeCompositionPart2;

public class BedroomTester {
    public static void main(String[] args) {

        OtherWall otherWall1 = new OtherWall("West");
        OtherWall otherWall2 = new OtherWall("East");
        OtherWall otherWall3 = new OtherWall("South");
        OtherWall otherWall4 = new OtherWall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Donnys", otherWall1, otherWall2, otherWall3,
                otherWall4, ceiling, bed, lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();






    }
}
