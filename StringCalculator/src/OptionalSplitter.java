public class OptionalSplitter implements ISplitter {
    private String numbers;

    public OptionalSplitter(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String getDelimiter() {
        return String.valueOf(numbers.charAt(0));
    }

    @Override
    public String getNumberString() {
        return numbers.substring(2, numbers.length());
    }
}