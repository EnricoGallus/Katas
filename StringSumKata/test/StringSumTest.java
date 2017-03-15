import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSumTest {

    @Test
    public void Sum_with_null_parameters_should_return_zero() {
        String result = StringSum.sum(null, null);
        Assertions.assertEquals("0", result);
    }

    @Test
    public void Sum_with_empty_parameters_should_return_zero() {
        String result = StringSum.sum("", "");
        Assertions.assertEquals("0", result);
    }

    @Test
    public void Sum_with_small_ints_should_return_sum() {
        String result = StringSum.sum("1", "3");
        Assertions.assertEquals("4", result);
    }

    @Test
    public void Sum_with_negativ_ints_should_return_sum() {
        String result = StringSum.sum("-1", "-3");
        Assertions.assertEquals("0", result);
    }

    @Test
    public void Sum_with_zero_should_return_sum() {
        String result = StringSum.sum("0", "10");
        Assertions.assertEquals("10", result);
    }

    @Test
    public void Sum_with_txt_should_return_zero() {
        String result = StringSum.sum("aa", "bb");
        Assertions.assertEquals("0", result);
    }

    @Test
    public void Sum_with_decimal_should_return_sum_of_integer_parts() {
        String result = StringSum.sum("1.12", "23.22");
        Assertions.assertEquals("0", result);
    }

    @Test
    public void Sum_with_hugh_integers() {
        String result = StringSum.sum("111111111111111", "11111111111111111");
        Assertions.assertEquals("11222222222222222", result);
    }

    @Test
    public void Sum_with_hugh_integers_having_carry() {
        String result = StringSum.sum("11112342345211111", "999999999999999");
        Assertions.assertEquals("12112342345211110", result);
    }

}
