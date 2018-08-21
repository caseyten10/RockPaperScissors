public class gameLogic {
    public int gameTypeLogic(int[] Answer, boolean humanOpponent, String playerName, String player2Name) {

//        Instancing classes
        singleTurn newTurn = new singleTurn();
        winCondition newCondition = new winCondition();

        double winCondition = newCondition.winsNeeded(Answer);
        int whoWon = 0;

//        single game logic
        if (Answer[0] == 1) {
            int whoScored = newTurn.singleTurn(humanOpponent, playerName, player2Name);
            if (whoScored == 2) {
                whoWon = 1;
            } else if (whoScored == 3){
                whoWon = 2;
            }
            else {
                whoWon = 3;
            }
        }
//            "best of.." and "first to.." logic
        else {
            int computerScore = 0;
            int playerScore = 0;
            int player2Score = 0;

            while (playerScore != winCondition && computerScore != winCondition && player2Score != winCondition) {
                int whoScored = newTurn.singleTurn(humanOpponent, playerName, player2Name);
                if (whoScored == 2) {
                    computerScore = computerScore + 1;
                } else if (whoScored == 3) {
                    playerScore = playerScore + 1;
                } else if (whoScored == 4) {
                    player2Score = player2Score + 1;
                }
                if (humanOpponent) {
                    System.out.print("\n" + playerName + "'s score is: " + playerScore + "\n" + player2Name + "'s score is: " + player2Score + "\n");
                } else {
                    System.out.print("\nThe computers score is: " + computerScore + "\nYour score is: " + playerScore + "\n");
                }
            }
            if (playerScore > computerScore) {
                whoWon = 2;
            } else if (computerScore > playerScore) {
                whoWon = 1;
            }

        }
        return whoWon;
    }
}
