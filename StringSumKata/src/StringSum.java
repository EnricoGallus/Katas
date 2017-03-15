import java.math.BigInteger;

public class StringSum {
    public static String sum(String num1, String num2) {

        BigInteger naturalNumber1 = new BigInteger(getNaturalNumberOrZeroStringified(num1));
        BigInteger naturalNumber2 = new BigInteger(getNaturalNumberOrZeroStringified(num2));

        return naturalNumber1.add(naturalNumber2).toString();
    }

    private static String getNaturalNumberOrZeroStringified(String number) {
        final String ZERO = "0";
        if (number == null || number == "") return ZERO;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') return ZERO;
        }

        return number;
    }
}
