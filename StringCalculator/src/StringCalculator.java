public class StringCalculator {
    private static final String NEWLINE = "\n";

    public static int add(String numbers) {

        boolean hasOptionalDelimiter = hasOptionalDelimiter(numbers);
        ISplitter splitter = hasOptionalDelimiter ? new OptionalSplitter(numbers) : new DefaultSplitter(numbers);
        String numberString = splitter.getNumberString();

        if (numberString == "") return 0;

        String[] parts = numberString.replace(NEWLINE, splitter.getDelimiter()).split(splitter.getDelimiter());
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
