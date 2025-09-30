package labWork3;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(23, 59, 59);
        System.out.println("t1 = " + t1);
        t1.nextSecond();
        System.out.println("after nextSecond = " + t1);

        Time t2 = new Time(0, 0, 0);
        System.out.println("t2 = " + t2);
        t2.previousSecond();
        System.out.println("after previousSecond = " + t2);

        Time t3 = new Time(12, 30, 45);
        System.out.println("t3 = " + t3);
        t3.nextSecond().nextSecond();
        System.out.println("t3 after +2 sec = " + t3);
    }
}
