import java.util.concurrent.atomic.AtomicLong;

public class Exercise5 {
    private static final int LIMIT = 100000;
    private static final int NUM_THREADS = 4;
    private static final AtomicLong totalSum = new AtomicLong(0);

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];
        int range = LIMIT / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            final int start = i * range + 1;
            final int end = (i == NUM_THREADS - 1) ? LIMIT : (i + 1) * range;

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        sum += num;
                    }
                }
                totalSum.addAndGet(sum);
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("Сумма простых чисел до " + LIMIT + ": " + totalSum.get());
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
