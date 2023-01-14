package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        int x = numberToBeDetermined;
        if (x > 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
