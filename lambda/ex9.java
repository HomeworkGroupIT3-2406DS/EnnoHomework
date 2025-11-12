interface PrimeCheck {
    boolean isPrime(int n);
}
public class ex9 {
    public static void main(String[] args) {
        primecheck primeCheck = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int number = 17;
        if (primeCheck.isPrime(number)) {
            System.out.println(number + " простое число");
        } else {
            System.out.println(number + " не простое число");
        }
    }
}