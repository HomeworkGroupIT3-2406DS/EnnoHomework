import java.util.Arrays;
import java.util.List;

interface AverageLength {
    double findAverage(List<String> list);
}
public class ex23 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear");

        AverageLength avg = (list) -> {
            int sum = 0;
            for (String s : list) {
                sum = sum + s.length();
            }
            return (double) sum / list.size();
        };

        double result = avg.findAverage(words);
        System.out.println("Средняя длина строк: " + result);
    }
}
