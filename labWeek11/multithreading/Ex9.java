import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Ex9 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                    System.out.println("Произвел: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Integer value = queue.take();
                    System.out.println("Потребил: " + value);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        producer.start();
        consumer.start();
    }
}
