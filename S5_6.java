import java.time.LocalDateTime;

public class S5_6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("春节倒计时");
        System.out.println("距离兔年春节还有");

        LocalDateTime newYear = LocalDateTime.of(2023, 1, 21, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(newYear.getDayOfYear() + (newYear.getYear() - now.getYear()) * 365 - now.getDayOfYear() - 1 + "天");
        System.out.print(newYear.getHour() - now.getHour() + 23 + ":");
        System.out.print(newYear.getMinute() - now.getMinute() + 59 + ":");
        System.out.print(newYear.getSecond() - now.getSecond() + 59);
        System.out.println();
    }
}