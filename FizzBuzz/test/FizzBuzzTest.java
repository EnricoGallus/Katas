import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void printNumbers_from_one_to_hundert() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] result = fizzBuzz.printNumbers();

        Assertions.assertEquals(100, result.length);
        Assertions.assertEquals("1", result[0]);
        Assertions.assertEquals("buzz", result[99]);
    }

    @Test
    public void printNumbers_replace_dividable_by_three_with_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] result = fizzBuzz.printNumbers();

        Assertions.assertEquals("fizz", result[2]);
        Assertions.assertEquals("fizz", result[95]);
    }

    @Test
    public void printNumbers_replace_dividable_by_five_with_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] result = fizzBuzz.printNumbers();

        Assertions.assertEquals("buzz", result[4]);
        Assertions.assertEquals("buzz", result[94]);
    }

    @Test
    public void printNumbers_replace_dividable_by_five_and_three_with_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] result = fizzBuzz.printNumbers();

        Assertions.assertEquals("fizzbuzz", result[14]);
        Assertions.assertEquals("fizzbuzz", result[29]);
    }

    @Test
    public void printNumbers_result_compare() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String[] result = fizzBuzz.printNumbers();
        String[] expected = getNumbers();

        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(expected[i], result[i]);
        }
    }

    private String[] getNumbers() {
        String[] numbers = new String[100];
        for (int i=1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) numbers[i - 1] = "fizzbuzz";
            else if (i % 3 == 0) numbers[i - 1] = "fizz";
            else if (i % 5 == 0) numbers[i - 1] = "buzz";
            else numbers[i - 1] = String.valueOf(i);
        }

        return numbers;
    }
}
