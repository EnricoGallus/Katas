import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSummer {
    private static List<String> negatives = new ArrayList<>();

    public static int getSum(String[] parts) {
        int sum = 0;

        for (String number : parts) {
            int toAdd = Integer.parseInt(number);
            if (toAdd < 0) negatives.add(number);
            sum += toAdd;
        }

        if (!negatives.isEmpty()) throw new IllegalArgumentException("negatives not allowed: " + Arrays.asList(negatives));

        return sum;
    }
}
