import java.util.ArrayList;

public class Frame {
    private ArrayList<Roll> rolls = new ArrayList<>();

    public void addRoll(Roll roll) {
        rolls.add(roll);
    }

    public int getScore() {
        int sum = 0;
        for (Roll roll : rolls) {
            sum += roll.getPins();
        }

        return sum;
    }

    public boolean isFinished() {
        return rolls.size() == 2 || getScore() >= 10;
    }

    public boolean isStrike() {
        return rolls.size() == 1 && getScore() == 10;
    }

    public boolean isSpare() {
        return rolls.size() == 2 && getScore() == 10;
    }
}
