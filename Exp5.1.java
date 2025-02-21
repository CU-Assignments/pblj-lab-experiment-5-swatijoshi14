import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) { 
                sum += num; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Object[] inputs = {10, 20, 30, "40", "50"};

        for (Object input : inputs) {
            if (input instanceof Integer) {
                numbers.add((Integer) input); 
            } else if (input instanceof String) {
                Integer parsedValue = parseStringToInteger((String) input);
                if (parsedValue != null) {
                    numbers.add(parsedValue);
                }
            }
        }

        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }
}
