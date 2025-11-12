interface StringConcat {
    String concat(String s1, String s2);
}
public class ex10 {
    public static void main(String[] args) {
        StringConcat join = (a, b) -> a + b;

        String str1 = "Hello ";
        String str2 = "World!";

        System.out.println("Результат: " + join.concat(str1, str2));
    }
}