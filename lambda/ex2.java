interface StringCheck {
    boolean isEmpty(String str);
}

public class ex2 {
    public static void main(String[] args) {
        StringCheck check = s -> s.isEmpty();
        String text1 = "";
        String text2 = "Hello";

        System.out.println("text1 пустааая? " + check.isEmpty(text1));
        System.out.println("text2 пустая? " + check.isEmpty(text2));
    }
}