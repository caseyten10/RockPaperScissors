import java.util.Scanner;

public class Game {

    public static void main(String args[]) {


//        Instancing classes
        offerPlay newofferPlay = new offerPlay();
        Opponent newOpponent = new Opponent();
        Mode newMode = new Mode();
        gameLogic newgameLogic = new gameLogic();
        playAgain newplayAgain = new playAgain();
        Scanner userInput = new Scanner(System.in);

//        Welcome
        System.out.println("\nWelcome to Rock, Paper, Scissors! \nWhat is your name?");
        String playerName = userInput.nextLine();
        System.out.println("\nHello " + playerName);

//      Do you want to play?
        newofferPlay.initialOffer();


//      "Keep playing?" loop
        Boolean gameOver = false;
        while (!gameOver) {

//      Human or AI combatant?
            boolean humanOpponent = newOpponent.opponentChoice();
            String player2Name = null;
            if (humanOpponent) {
                System.out.println("What is the name of the second player?");
                player2Name = userInput.nextLine();
            }

//      Which game mode?
            int[] Answer = newMode.modeType();

//      Game begins
            System.out.print("\nLets play!");

//      Game logic
            int whoWon = newgameLogic.gameTypeLogic(Answer, humanOpponent, playerName, player2Name);

//      Declaring a winner
            if (whoWon == 1) {
                System.out.print("\nSorry " + playerName + " you didn't win this time.\n");
            } else if (whoWon == 2) {
                System.out.print("\nCongratulations " + playerName + " you won!\n");
            } else if (whoWon == 3) {
                System.out.print("\nCongratulations " + player2Name + " you won!\n");
            } else {
                System.out.print("\nsomething went wrong");
            }

//      Play again?

            gameOver = newplayAgain.stopContinue();
        }

    }

}
