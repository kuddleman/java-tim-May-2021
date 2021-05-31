package section7oopPart2.codingChallengeCompositionPart2.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Donny";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHeath(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }


}
