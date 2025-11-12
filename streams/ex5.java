import java.util.*;
import java.util.stream.*;

public class ex5 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("Apple", "Adolf", "Stalin", "Alma", "Llululu");
        char letter = 'A';

        long count = word.stream()
                .filter(words -> words.startsWith(String.valueOf(letter)))
                .count();
        System.out.println(count);

    }
}