import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void score_without_hits_should_be_zero() {

        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        Assertions.assertEquals(0, game.score());
    }

    @Test
    public void roll_with_only_ones_should_be_summed() {

        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }

        Assertions.assertEquals(20, game.score());
    }

    @Test
    public void roll_with_ten_totals_should_return() {

        Game game = new Game();
        for (int i = 0; i < 10; i++) {
            game.roll(10);
        }

        Assertions.assertEquals(300, game.score());
    }
}
