package section7oopPart2.codingChallengeCompositionPart2.encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHeath(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
