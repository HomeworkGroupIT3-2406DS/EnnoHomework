import java.util.*;
import java.util.stream.*;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 62, 31, 41, 53, 65, 72);

        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}