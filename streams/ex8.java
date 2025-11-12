import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ex8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer secondSmall = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondSmall);

         Integer secondLarge = nums.stream()
                 .distinct()
                 .sorted((a, b) -> Integer.compare(b, a))
                 .skip(1)
                 .findFirst()
                 .orElse(null);
        System.out.println(secondLarge);

        }


    }
