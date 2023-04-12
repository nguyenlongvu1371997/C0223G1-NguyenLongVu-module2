package ss8_clean_code.excercise;

import java.util.Scanner;

public class TennisGame {
    public static String displayScore(int score) {
        String tempScore;
        switch (score) {
            case 0:
                tempScore = "love";
                break;
            case 1:
                tempScore = "fifteen";
                break;
            case 2:
                tempScore = "thirty";
                break;
            case 3:
                tempScore = "forty";
                break;
            default:
                tempScore = "deceu";

        }
        return tempScore;
    }


    public static String getScore(int score1, int score2) {
        String score;

        if (score1 == score2) {
            score = displayScore(score1) + " all";
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            score = displayScore(score1) + "-" + displayScore(score2);
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = Integer.parseInt(sc.nextLine());
        int score2 = Integer.parseInt(sc.nextLine());
        System.out.println(getScore(score1, score2));
    }
}