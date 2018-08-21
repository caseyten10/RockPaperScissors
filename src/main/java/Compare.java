public class Compare {


    public int comparedChoices(String playerChoice, String player2Choice, String computerChoice, boolean humanOpponent) {

        int winType = 1;

//        winType: 1 is a tie, 2 is computer win, 3 is human win, 4 is a second player win

        if (humanOpponent) {
            computerChoice = player2Choice;
        }

        if (playerChoice.equals("rock")) {
            if (computerChoice.equals("rock")) {
                winType = 1;
            } else if (computerChoice.equals("paper")) {
                winType = 2;
            } else if (computerChoice.equals("scissors")) {
                winType = 3;
            }
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                winType = 3;
            } else if (computerChoice.equals("paper")) {
                winType = 1;
            } else if (computerChoice.equals("scissors")) {
                winType = 2;
            }
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                winType = 2;
            } else if (computerChoice.equals("paper")) {
                winType = 3;
            } else if (computerChoice.equals("scissors")) {
                winType = 1;
            }
        } else {
            winType = 5;
        }

        if (humanOpponent && (winType == 2)) {
            winType = 4;
        }

        return winType;

    }

}
