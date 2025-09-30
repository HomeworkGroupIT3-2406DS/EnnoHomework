package labWork3;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(31, 1, 2020);
        System.out.println(d1);
        Date d2 = new Date(30, 2, 2021);  // неверно
        System.out.println(d2);
        d2.setDate(29, 2, 2020);
        System.out.println("After set: " + d2);
        d2.setDate(31, 6, 2022);
        System.out.println("After invalid set: " + d2);
    }
}
