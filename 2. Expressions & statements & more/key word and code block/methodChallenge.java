public class methodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        int highScorePosition2 = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition2);

        int highScorePosition3 = calculateHighScorePosition(500);
        displayHighScorePosition("Ryan", highScorePosition3);

        int highScorePosition4 = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition4);

        int highScorePosition5 = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition5);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if ( playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
