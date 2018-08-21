import java.util.Scanner;

public class Opponent {
    private boolean humanOpponent;

    public boolean opponentChoice() {
        Scanner userInput = new Scanner(System.in);
        char combatantChar = 't';
        while (combatantChar == 't') {
            System.out.println("\nWould you like to play against\nA - The computer\nB - Another player\nSelect A or B:");
            String Combatant = userInput.nextLine();
            String combatant = Combatant.toLowerCase();
            combatantChar = combatant.charAt(0);
            if (combatantChar == 'a') {
                humanOpponent = false;
            } else if (combatantChar == 'b') {
                humanOpponent = true;
            } else {
                System.out.print("\nI didn't understand that sorry.");
                combatantChar = 't';
            }
        }
        return humanOpponent;

    }
}
