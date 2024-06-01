package org.example;

public class Player {
    private String name;
    private String team;
    private String league;
    private int ranking;

    public Player(String name, String team, String league, int ranking) {
        this.name = name;
        this.team = team;
        this.league = league;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getLeague() {
        return league;
    }

    public int getRanking() {
        return ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}

