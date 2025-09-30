package labWork3;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year) {
        if (isValid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Invalid date, setting to default 1/1/2000");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        if (isValid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Invalid date, not changed");
        }
    }

    private boolean isValid(int d, int m, int y) {
        if (y < 0) return false;
        if (m < 1 || m > 12) return false;
        int maxDay;
        switch (m) {
            case 2:
                if (isLeapYear(y)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            default:
                maxDay = 31;
        }
        return (d >= 1 && d <= maxDay);
    }

    private boolean isLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
