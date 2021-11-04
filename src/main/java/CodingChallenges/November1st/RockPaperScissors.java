package CodingChallenges.November1st;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Rock Paper Scissors
        String player1 = sc.nextLine();
        String player2 = sc.nextLine();
        System.out.println(rps(player1, player2));


    }

    static String rps(String p1, String p2) {

        String winner = "Player 1";
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();

        if (p1.equals(p2)) return "TIE";

        if ((p1.equals("rock") && p2.equals("paper"))
                || (p1.equals("paper") && p2.equals("scissors"))
                || (p1.equals("scissors") && p2.equals("rock"))) {
            winner = "Player 2";
        }

        return winner + " wins";
    }





}
