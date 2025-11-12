import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4 {
    public static void main(String[] args) {
        List<Integer>  nums = Arrays.asList(10, 11, 12, 11, 34, 12, 15);

        List<Integer> distinctNumbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
