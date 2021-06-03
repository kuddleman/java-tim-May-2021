package section7oopPart2.codingChallengeCompositionPart2.billsBurgers;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additional1Name;
    private double additional1Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
}
