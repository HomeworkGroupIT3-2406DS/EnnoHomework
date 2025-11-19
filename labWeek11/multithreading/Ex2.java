public class Ex2 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for(int i=0; i<=20; i+=2) System.out.println("Even: " + i);
        };
        Runnable r2 = () -> {
            for(int i=1; i<=20; i+=2) System.out.println("Odd: " + i);
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
