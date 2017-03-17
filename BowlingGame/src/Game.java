import java.util.ArrayList;

public class Game {

    Frame[] frames = new Frame[10];

    public Game() {
        for (int i = 0; i < 10; i++) {
            frames[i] = new Frame();
        }
    }

    public void roll(int pins) {
        for (Frame frame : frames) {
            if (!frame.isFinished()) {
                frame.addRoll(new Roll(pins));
            }
        }
    }

    public int score() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Frame current = frames[i];
            sum += current.getScore();

            if (current.isStrike()) {
                if (i < 9) sum += frames[i + 1].getScore();
                if (i < 8) sum += frames[i + 2].getScore();
            }

            if (current.isSpare()) {
                sum += 5;
            }
        }

        return sum;
    }
}
