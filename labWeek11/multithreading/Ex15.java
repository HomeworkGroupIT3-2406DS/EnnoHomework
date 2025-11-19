import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex15 {
    private final Lock lock = new ReentrantLock();

    public void safePrint(String msg) {
        lock.lock();
        try {
            System.out.print("[");
            Thread.sleep(100);
            System.out.print(msg);
            Thread.sleep(100);
            System.out.println("]");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Ex15 printer = new Ex15();
        Runnable task = () -> printer.safePrint("Hello");
        
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
