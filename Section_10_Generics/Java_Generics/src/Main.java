import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");

        adelaideCrows.addPlayer(joe);
        baseballTeam.addPlayer(pat);
        soccerTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

//        adelaideCrows.matchResult(baseballTeam,1,1); //error
        System.out.println("____Rankings____");
        System.out.println(adelaideCrows.getName() + " Ranking: " + adelaideCrows.ranking());
        System.out.println(hawthorn.getName() + " Ranking: " + hawthorn.ranking());
        System.out.println(fremantle.getName() + " Ranking: " + fremantle.ranking());
        System.out.println(melbourne.getName() + " Ranking: " + melbourne.ranking());

//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(melbourne.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        footballLeague.addteam(adelaideCrows);
        footballLeague.addteam(hawthorn);
        footballLeague.addteam(fremantle);
        footballLeague.addteam(melbourne);

        System.out.println("____League Table____");
        footballLeague.showLeagueTable();


    }


}
