public class FizzBuzz {
    public String[] printNumbers() {
        String[] numbers = new String[100];

        for (int i=1; i <= 100; i++) {
            numbers[i - 1] = replaceIfDividable(i);
        }

        return numbers;
    }

    private String replaceIfDividable(int number) {
        boolean dividableByThree = number % 3 == 0;
        boolean dividableByFive = number % 5 == 0;

        if (dividableByFive && dividableByThree) return "fizzbuzz";
        if (dividableByThree) return "fizz";
        if (dividableByFive) return "buzz";
        return String.valueOf(number);
    }
}
