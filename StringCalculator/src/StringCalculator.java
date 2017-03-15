public class StringCalculator {
    public static int add(String numbers) {

        Splitter splitter = SplitterFactory.getSplitter(numbers);
        if (splitter.isEmpty()) return 0;
        String[] parts = splitter.getParts();
        return IntegerSummer.getSum(parts);
    }
}
