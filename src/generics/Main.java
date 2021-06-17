package generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        // crows is football team
        Team<FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);
        //crows.addPlayer(pat);
        //crows.addPlayer(beckham);
        System.out.println(crows.numPlayers());


    }
}
