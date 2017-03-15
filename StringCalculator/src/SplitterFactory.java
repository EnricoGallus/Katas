public class SplitterFactory {

    public static Splitter getSplitter(String numbers) {
        boolean hasOptionalDelimiter = hasOptionalDelimiter(numbers);
        return hasOptionalDelimiter ? new OptionalSplitter(numbers) : new DefaultSplitter(numbers);
    }

    private static boolean hasOptionalDelimiter(String numbers) {
        return numbers.length() > 3 && !Character.isDigit(numbers.charAt(0)) && numbers.startsWith("\n", 1);
    }
}
