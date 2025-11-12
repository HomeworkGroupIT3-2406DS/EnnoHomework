import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ex6 {
    public static void main(String[] args) {
        List<String> slova = Arrays.asList("Lsv", "sdljnf", "BUbdi", "kukuku", "soz");

        List<String> ascendingOrder = slova.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ascendingOrder);

        List<String> descendingOrder = slova.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(descendingOrder);
    }
}