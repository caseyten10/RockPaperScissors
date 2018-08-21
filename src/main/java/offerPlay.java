import java.util.Scanner;

public class offerPlay{

    public void initialOffer() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nWould you like to play a game of Rock, Paper, Scissors?");
        char yn = 'r';
        while (yn == 'r') {
            String yesNo = userInput.nextLine();
            String yesno = yesNo.toLowerCase();
            yn = yesno.charAt(0);
            if (yn == 'n') {
                System.out.println("\nBye then!");
                System.exit(0);
            } else if (yn == 'y') {
                continue;
            } else {
                System.out.println("\nI didn't catch that.\nType either yes or no.");
                yn = 'r';
            }
        }
    }
}
