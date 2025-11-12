interface Sum {
    int add(int a, int b);
}
public class ex1 {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;
        int result = sum.add(5, 7);
        System.out.println("Сумма: " + result);
    }
}