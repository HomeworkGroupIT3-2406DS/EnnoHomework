@FunctionalInterface
interface Factorial {
    int calculate(int n);
}
public class ex8 {
    public static void main(String[] args) {

        Factorial factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int number = 5;
        System.out.println("Факториал " + number + " = " + factorial.calculate(number));
    }
}