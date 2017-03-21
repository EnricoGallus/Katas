import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void printNumbers_will_return_all_numbers() {
        String[] numbers = OddEven.printNumbers(1, 100);

        Assertions.assertEquals(100, numbers.length);
        Assertions.assertEquals("1", numbers[0]);
        Assertions.assertEquals("even", numbers[99]);
    }

    @Test
    public void printNumbers_will_replace_dividable_by_2_with_even() {
        String[] numbers = OddEven.printNumbers(1, 100);

        Assertions.assertEquals(100, numbers.length);
        Assertions.assertEquals("even", numbers[1]);
        Assertions.assertEquals("3", numbers[2]);
        Assertions.assertEquals("even", numbers[99]);
    }

    @Test
    public void printNumbers_will_replace_none_prime_with_odd() {
        String[] numbers = OddEven.printNumbers(1, 100);

        Assertions.assertEquals(100, numbers.length);
        Assertions.assertEquals("1", numbers[0]);
        Assertions.assertEquals("even", numbers[1]);
        Assertions.assertEquals("3", numbers[2]);
        Assertions.assertEquals("odd", numbers[8]);
        Assertions.assertEquals("even", numbers[99]);
    }

    @Test
    public void printNumbers_works_for_negativ() {
        String[] numbers = OddEven.printNumbers(-10, -2);

        Assertions.assertEquals(9, numbers.length);
        Assertions.assertEquals("even", numbers[0]);
        Assertions.assertEquals("odd", numbers[1]);
        Assertions.assertEquals("even", numbers[2]);
        Assertions.assertEquals("-7", numbers[3]);
        Assertions.assertEquals("even", numbers[8]);
    }

    @Test
    public void printNumbers_max_bigger_than_min() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> OddEven.printNumbers(101, 100));

        Assertions.assertEquals("max cannot be smaller than min", exception.getMessage());
    }
}
