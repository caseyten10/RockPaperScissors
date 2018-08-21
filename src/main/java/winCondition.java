public class winCondition {

    private double winCondition;
    public double winsNeeded(int[] Answer) {
//      single game win conditions
        if (Answer[0] == 1) {
            winCondition = 1;
        }
//      "best of.." win conditions
        else if (Answer[0] == 2) {
            double bestOf = ((Answer[1] / 2) + 0.1);
            winCondition = Math.ceil(bestOf);
        }
//      "first to.." win conditions
        else if (Answer[0] == 3) {
            winCondition = Answer[1];
        }
        return winCondition;
    }
}
