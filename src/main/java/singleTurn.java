public class singleTurn {

    public Integer singleTurn(boolean humanOpponent, String playerName, String player2Name) {


//      Instancing classes
        Computer newComputer = new Computer();
        Player newPlayer1 = new Player();
        Player newPlayer2 = new Player();
        Compare newCompare = new Compare();
//      Setting needed variable
        int whoScored = 1;
        String player2Choice = "Void";
//            Plays the game

//            tie loop
        while (whoScored == 1) {

//          Check for second player
            if (humanOpponent){
                System.out.print ("\n" +playerName +" its your turn, " + player2Name + " look away now!");
            }

//          Let Player choose
            String playerChoice = newPlayer1.playerTurn();

//          Re-Check for second player
            if (humanOpponent) {
                System.out.print ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + player2Name +" its your turn:");
                player2Choice = newPlayer2.playerTurn();
            }
//            Set computers choice
            String computerChoice = newComputer.computerTurn();

//            Declare choices
                if(!humanOpponent) {
                    System.out.println("\nYou chose " + playerChoice + " and the computer chose " + computerChoice);
                }
                else {
                    System.out.println("\n" + playerName + " chose " + playerChoice + " and " + player2Name + " chose " + player2Choice);
                }

//            Find out who won
//            winScored: 1 is a tie, 2 is computer win, 3 is human win, 4 is second player win.
            whoScored = newCompare.comparedChoices(playerChoice, player2Choice, computerChoice, humanOpponent);

//            Tie condition
            if (whoScored == 1) {

                System.out.print("\nIts a tie! \nChoose again.");
            }
        }

        return whoScored;
    }

}
