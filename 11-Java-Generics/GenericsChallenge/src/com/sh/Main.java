package com.sh;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Football League");
        Team<FootballPlayer> footballTeam = new Team<>("Amazing");
        Team<FootballPlayer> footballTeam2 = new Team<>("Thunder");
        Team<FootballPlayer> footballTeam3 = new Team<>("Red Bulls");
        Team<FootballPlayer> footballTeam4 = new Team<>("Fierce Rhinos");

        footballLeague.addTeam(footballTeam);
        footballLeague.addTeam(footballTeam2);
        footballLeague.addTeam(footballTeam3);
        footballLeague.addTeam(footballTeam4);

        footballTeam2.matchResult(footballTeam3, 1, 0);
        footballTeam2.matchResult(footballTeam, 3, 8);
        footballTeam.matchResult(footballTeam3, 2, 1);

        System.out.println("Rankings:");
        footballLeague.showLeagueTable();
    }
}
