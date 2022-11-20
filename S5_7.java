import java.util.GregorianCalendar;
import java.util.Scanner;

public class S5_7 {
    public static void main(String[] args) {
        GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            System.out.print("请输入一个年份:");

            int year = in.nextInt();

            int day;
            if (calendar.isLeapYear(year)) {
                day = 29;
            } else {
                day = 28;
            }
            System.out.println("该年二月份有" + day + "天");
        }

    }
}