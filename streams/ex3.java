import java.util.Arrays;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 23, 24, 60, 44, 68, 31);

        int sumofEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumofEvens);

        int sumofOdds = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumofOdds);
    }
}