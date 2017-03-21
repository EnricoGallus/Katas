public class OddEven {
    public static String[] printNumbers(int min, int max) {
        if (max < min) throw new IllegalArgumentException("max cannot be smaller than min");
        int length = Math.abs(max - min) + 1;

        String[] numbers = new String[length];
        int arrayCounter = 0;
        for (int i = min; i <= max; i++) {
            numbers[arrayCounter++] = getNumberOrName(i);
        }

        return numbers;
    }

    public static String getNumberOrName(int number) {
        if (number % 2 == 0) return "even";
        else if (!isPrime(number)) return "odd";
        else return String.valueOf(number);
    }

    private static boolean isPrime(int number) {
        int absoluteNumber = Math.abs(number);
        for(int i = 2; i < absoluteNumber; i++) {
            if(absoluteNumber % i==0) return false;
        }
        return true;
    }
}
