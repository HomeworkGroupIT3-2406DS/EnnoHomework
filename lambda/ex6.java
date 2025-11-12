import java.util.Arrays;
import java.util.List;

public class ex6 {
    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(5.5, 3.2, 8.7, 2.0, 4.6);
        double average = numbers.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение " + average);
    }
}