public class DefaultSplitter implements ISplitter {
    private final String DEFAULTDELIMITER = ",";
    private String numbers;

    public DefaultSplitter(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String getDelimiter() {
        return DEFAULTDELIMITER;
    }

    @Override
    public String getNumberString() {
        return numbers;
    }
}