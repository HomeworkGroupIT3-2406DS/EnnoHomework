import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Ex14 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> 
            System.out.println("=== Все потоки достигли барьера, объединяем результаты ===")
        );

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " выполняет фазу 1");
                    Thread.sleep((long)(Math.random() * 1000));
                    System.out.println(Thread.currentThread().getName() + " ждет у барьера");
                    barrier.await();
                    System.out.println(Thread.currentThread().getName() + " начал фазу 2");
                } catch (InterruptedException | BrokenBarrierException e) { e.printStackTrace(); }
            }, "Worker-" + i).start();
        }
    }
}
