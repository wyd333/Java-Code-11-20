import java.util.Scanner;

public class S5_1 {
    public static void main(String[] args) {
        System.out.print("����:");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.println("***************************");
        System.out.println("���ܷ���:ÿ���ַ���ASCII���1");
        System.out.println("***************************");
        System.out.print("����:");
        char[] a = x.toCharArray();

        for (int i = 0; i < a.length; i++) {
            a[i] += 1;
            System.out.print(a[i]);
        }

        System.out.println();
        System.out.println("***************************");
        System.out.print("����:");
        for (int i = 0; i < a.length; i++) {
            a[i] -= 1;
            System.out.print(a[i]);
        }
    }
}