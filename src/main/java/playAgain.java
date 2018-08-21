import java.util.Scanner;

public class playAgain {


    public boolean stopContinue() {

        Scanner userInput = new Scanner(System.in);
        boolean gameOver=false;

        System.out.print("Would you like to play again?\n");
        int playingOrNot = 1;
        while (playingOrNot == 1) {
            String playAgain = userInput.nextLine();
            String playagain = playAgain.toLowerCase();
            char playagainyn = playagain.charAt(0);
            if (playagainyn == 'n') {
                System.out.println("\nBye then!");
                gameOver = true;
                playingOrNot = 0;
            } else if (playagainyn == 'y') {
                System.out.println("\nOK then!");
                gameOver = false;
                playingOrNot = 0;
            } else {
                System.out.println("\nI didn't catch that.\nType either yes or no.");
                playingOrNot = 1;
            }
        }
        return gameOver;
    }
}
