public abstract class Splitter {
    private static final String NEWLINE = "\n";
    protected volatile String DEFAULTDELIMITER = ",";
    protected String numbers;

    public Splitter(String numbers) {
        this.numbers = numbers;
    }

    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    protected String getNumberString() {
        return numbers;
    }

    public String[] getParts() {
        return getNumberString().replace(NEWLINE, DEFAULTDELIMITER).split(DEFAULTDELIMITER);
    }
}