import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "batman", "SuuIII");

        List<String> uppercaseStrings = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseStrings);



        List<String> lowercaseString = words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowercaseString);

    }
}