package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("久保建英", "Real sociedad", "LALIGA", 6));
        players.add(new Player("冨安健洋", "Arsenal FC", "Premier League", 2));
        players.add(new Player("遠藤航", "Liverpool FC", "Premier League", 3));
        players.add(new Player("三苫薫", "Brighton & Hove Albion FC", "Premier League", 11));
        players.add(new Player("南野拓実", "AS Monaco", "Ligue 1", 2));
        players.add(new Player("守田英正", "Sporting CP", "Liga Portugal Betclic", 1));

        for (Player player : players) {
            try {
                checkRanking(player);
                if (player.getRanking() <= 4) {
                    System.out.println("CL出場");
                    System.out.println(player.getName() + " : " + player.getTeam() + " : " + player.getLeague() + " : " + player.getRanking() + "位");
                } else if (player.getRanking() <= 6) {
                    System.out.println("EL出場");
                    System.out.println(player.getName() + " : " + player.getTeam() + " : " + player.getLeague() + " : " + player.getRanking() + "位");
                }
            } catch (InvalidRankingException e) {
                System.out.println("出場権獲得ならず: " + e.getMessage());
                System.out.println(player.getName() + " : " + player.getTeam() + " : " + player.getLeague() + " : " + player.getRanking() + "位");
            }
        }
    }
    public static void checkRanking(Player player) throws InvalidRankingException {
        if (player.getRanking() > 6) {
            throw new InvalidRankingException("来シーズン頑張って下さい");
        }
    }
}
