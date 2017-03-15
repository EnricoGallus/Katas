public class StringCalculator {
    private static final String DEFAULTDELIMITER = ",";
    private static final String NEWLINE = "\n";

    public static int add(String numbers) {

        boolean hasOptionalDelimiter = hasOptionalDelimiter(numbers);
        String delimiter = hasOptionalDelimiter ? String.valueOf(numbers.charAt(0)) : DEFAULTDELIMITER;
        numbers = hasOptionalDelimiter ? numbers.substring(2, numbers.length()) : numbers;
        if (numbers == "") return 0;

        String[] parts = numbers.replace(NEWLINE, delimiter).split(delimiter);
        return getSum(parts);
    }

    private static boolean hasOptionalDelimiter(String numbers) {
        return numbers.length() > 3 && !Character.isDigit(numbers.charAt(0)) && numbers.startsWith(NEWLINE, 1);
    }

    private static int getSum(String[] parts) {
        int sum = 0;
        for (String number : parts) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
