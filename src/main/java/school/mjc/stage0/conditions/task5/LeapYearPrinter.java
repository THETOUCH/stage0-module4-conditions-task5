package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int x;
        x = year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? 1 : 0;
        switch (x) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
        }
    }
}
