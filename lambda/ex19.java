import java.util.Arrays;
import java.util.List;

interface FindValue {
    int find(List<Integer> list);
}
public class ex19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 5, 8, 2, 15, 7);

        FindValue secondLargest = (list) -> {
            int max = list.get(0);
            int second = Integer.MIN_VALUE;

            for (int n : list) {
                if (n > max) {
                    second = max;
                    max = n;
                } else if (n > second && n != max) {
                    second = n;
                }
            }
            return second;
        };

        FindValue secondSmallest = (list) -> {
            int min = list.get(0);
            int second = Integer.MAX_VALUE;

            for (int n : list) {
                if (n < min) {
                    second = min;
                    min = n;
                } else if (n < second && n != min) {
                    second = n;
                }
            }
            return second;
        };

        int secMax = secondLargest.find(numbers);
        int secMin = secondSmallest.find(numbers);

        System.out.println("Список: " + numbers);
        System.out.println("Второй наибольший элемент " + secMax);
        System.out.println("Второй наименьший элемент " + secMin);
    }
}
