import java.util.Scanner;

public class Mode {

    public int[] modeType() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nWhich game mode would you like to play?\nChoose from:\nA - Single turn\nB - 'Best of ...'\nC - 'First to ...'");

        int[] modeSelected = new int[2];
        Boolean choiceMade = false;

//        until choice correctly made loop
        while (!choiceMade) {
            String selectedMode = userInput.nextLine();
            String selectedmode = selectedMode.toLowerCase();
//            single game choice
            if (selectedmode.equals("a")) {
                choiceMade = true;
                modeSelected[0] = 1;
            }
//            "best of.." mode choice
            else if (selectedmode.equals("b")) {
                System.out.println("\nBest of how many? (Must be an odd number)");

                Boolean valid = false;
                int rounds;
//                Valid choice loop
                while (!valid) {
                    if(userInput.hasNextInt()){
                        rounds = userInput.nextInt();

                    if (rounds % 2 == 0) {
                        System.out.println("\nMUST BE AN ODD NUMBER!\nBest of how many?");
                        valid=false;
                    } else if (1 <= rounds && rounds <= 49) {
                        modeSelected[0] = 2;
                        modeSelected[1] = rounds;
                        valid=true;
                    } else if (rounds >= 50) {
                        System.out.println("\nBe serious! I don't have all day to play with you!\nBest of how many rounds? (between 1 and 49)");
                        valid=false;

                    } else {
                        System.out.println("\nI didn't understand that input. Please select a number between 1 and 49");
                        valid=false;
                    } choiceMade=true;
                    }
                    else{
                        System.out.println("\nThat wasn't a number!\nBest of how many? (Between 1 and 49)");
                        userInput.next();
                    }

                }


            }
//            "first to.." mode choice
            else if (selectedmode.equals("c")) {
                System.out.println("\nFirst to how many?");

                Boolean valid = false;
                int rounds;
//                Valid choice loop
                while (!valid) {
                    if(userInput.hasNextInt()){
                        rounds = userInput.nextInt();

                        if (1 <= rounds && rounds <= 50) {
                            modeSelected[0] = 3;
                            modeSelected[1] = rounds;
                            valid=true;
                        } else if (rounds >= 50) {
                            System.out.println("\nBe serious! I don't have all day to play with you!\nChoose how many rounds to play (between 1 and 50)");
                            valid=false;

                        } else {
                            System.out.println("\nI didn't understand that input. Please select a number between 1 and 50");
                            valid=false;
                        } choiceMade=true;
                    }
                    else{
                        System.out.println("\nThat wasn't a number!\nFirst to how many? (Between 1 and 50)");
                        userInput.next();
                    }

                }

            }
//            incomprehensible response
            else {
                System.out.println("\nI didnt understand that response. Please select either A, B, or C");
                choiceMade = false;
            }


        }
        return modeSelected;
    }
}

