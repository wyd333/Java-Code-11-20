import java.util.Scanner;

public class S5_1 {
    public static void main(String[] args) {
        System.out.print("明文:");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.println("***************************");
        System.out.println("加密方法:每个字符的ASCII码加1");
        System.out.println("***************************");
        System.out.print("密文:");
        char[] a = x.toCharArray();

        for (int i = 0; i < a.length; i++) {
            a[i] += 1;
            System.out.print(a[i]);
        }

        System.out.println();
        System.out.println("***************************");
        System.out.print("解密:");
        for (int i = 0; i < a.length; i++) {
            a[i] -= 1;
            System.out.print(a[i]);
        }
    }
}