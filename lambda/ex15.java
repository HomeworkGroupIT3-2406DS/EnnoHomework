import java.util.Arrays;
import java.util.List;
interface SumSquares {
    int calculate(List<Integer> numbers);
}

public class ex15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        SumSquares evenSum = (list) -> {
            int sum = 0;
            for (int n : list) {
                if (n % 2 == 0) {
                    sum = sum + (n * n);
                }
            }
            return sum;
        };
        SumSquares oddSum = (list) -> {
            int sum = 0;
            for (int n : list) {
                if (n % 2 != 0) {
                    sum = sum + (n * n);
                }
            }
            return sum;
        };

        int evenResult = evenSum.calculate(numbers);
        int oddResult = oddSum.calculate(numbers);

        System.out.println("Список " + numbers);
        System.out.println("четные" + evenResult);
        System.out.println("не четные " + oddResult);
    }
}
