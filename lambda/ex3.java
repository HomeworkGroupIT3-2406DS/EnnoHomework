import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Java", "WORLD");
        List<String> upperCaseWords = words.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        List<String> lowerCaseWords = words.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + words);
        System.out.println("верхний регистр " + upperCaseWords);
        System.out.println("нижний регистр " + lowerCaseWords);
    }
}