import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Integer maxNum = num.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println(maxNum);

        Integer minNum = num.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println(minNum);




    }
}