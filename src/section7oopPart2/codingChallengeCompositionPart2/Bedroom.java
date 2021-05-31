package section7oopPart2.codingChallengeCompositionPart2;

import section6oopPart1.Wall;

public class Bedroom {
    private String name;
    private OtherWall otherWall1;
    private OtherWall otherWall2;
    private OtherWall otherWall3;
    private OtherWall otherWall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, OtherWall otherWall1, OtherWall otherWall2,
                   OtherWall otherWall3, OtherWall otherWall4, Ceiling ceiling,
                   Bed bed, Lamp lamp) {
        this.name = name;
        this.otherWall1 = otherWall1;
        this.otherWall2 = otherWall2;
        this.otherWall3 = otherWall3;
        this.otherWall4 = otherWall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {

    }

    public void makeBed() {
        System.out.println("Bedroom class making bed");
        bed.make;
    }
}
