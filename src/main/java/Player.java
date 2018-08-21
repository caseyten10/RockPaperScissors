import java.util.Scanner;


public class Player {


    public String playerTurn(){

    Scanner userInput = new Scanner(System.in);
    String playerChoice = "Void";

    while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
        System.out.println("\nType either Rock, Paper or Scissors");
        String playerChoice1 = userInput.nextLine();
        playerChoice = playerChoice1.toLowerCase();
        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.print("\nThat was not a valid input, try again.");
        }
    }
        return playerChoice;


}
}