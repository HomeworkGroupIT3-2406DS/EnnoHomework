import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ex11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 3, 19, 7, 1, 8);

        int max = numbers.stream()
                .max((a, b) -> a.compareTo(b))
                .orElse(Integer.MIN_VALUE);

        int min = numbers.stream()
                .min((a, b) -> a.compareTo(b))
                .orElse(Integer.MAX_VALUE);

        System.out.println("Список: " + numbers);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
}