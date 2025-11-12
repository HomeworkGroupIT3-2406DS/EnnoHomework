import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ex7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 5, 5, 7, 8, 8, 9);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Исходный список " + numbers);
        System.out.println(" без дубликатов " + uniqueNumbers);
    }
}