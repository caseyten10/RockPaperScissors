import java.util.ArrayList;
import java.util.Random;
public class Computer {

    public String computerTurn()
    {
        String[] computerOptions = {"rock", "paper", "scissors"};
        String computerChoice;

        Random compChoiceNo = new Random();

        int no = compChoiceNo.nextInt(3);
        computerChoice = computerOptions[no];
        return computerChoice;








}}
