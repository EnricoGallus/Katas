public class OptionalSplitter extends Splitter {

    public OptionalSplitter(String numbers) {
        super(numbers);
        DEFAULTDELIMITER = String.valueOf(numbers.charAt(0));
    }

    @Override
    public String getNumberString() {
        return numbers.substring(2, numbers.length());
    }
}