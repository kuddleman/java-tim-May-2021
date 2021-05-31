package section7oopPart2.codingChallengeCompositionPart2.encapsulationChallenge;

public class PrinterTester {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50.00, 100, false);

       // printer1.addToner(90.00);
        printer1.printPage(12);

    }
}
