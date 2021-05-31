package section7oopPart2.codingChallengeCompositionPart2.encapsulationChallenge;

public class Printer {
    private double tonerLevel;  // percent full.  Max is 100.00
    private int numPagesPrinted;
    private boolean printsOnBothSides;

    public Printer(double tonerLevel, int numPagesPrinted, boolean printsOnBothSides) {
        this.tonerLevel = tonerLevel;
        this.numPagesPrinted = numPagesPrinted;
        this.printsOnBothSides = printsOnBothSides;
    }

    public void addToner(double amtTonerToAdd) {
        double newTonerLevel = this.tonerLevel += amtTonerToAdd;
        if(newTonerLevel <= 100.0) {
            this.tonerLevel = newTonerLevel;
            System.out.println("The new toner level is: " + newTonerLevel);
        } else {
            System.out.println("You are adding too much toner!");
        }
    }

    public void printPage(int pagesToPrint) {
        this.numPagesPrinted += pagesToPrint;
        System.out.println("The number of pages printed is now: " + this.numPagesPrinted);

        if(printsOnBothSides) {
            System.out.println("Printer is printing on BOTH sides of the paper.");
        } else {
            System.out.println("Printer is printing on ONE side of the paper only.");
        }
    }

}
