public class Ex1 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Привет из потока!"));
        t.start();
    }
}
