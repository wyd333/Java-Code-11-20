import java.io.IOException;
import java.util.Scanner;
//用户名:administration
//密码:1122334455

public class S5_2 {
    private static String[] array1 = new String[5];
    private static String[] array2 = new String[5];
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        array1[0] = "administration";
        array2[0] = "1122334455";
        int count = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("用户名：");
            String userName = in.nextLine();
            System.out.println("密码：");
            String passWord = in.nextLine();

            if (userName.equals(array1[0]) && passWord.equals(array2[0])) {
                System.out.println("登录成功！！！！！");
                Runtime run = Runtime.getRuntime();
                Process pro = Runtime.getRuntime().exec("calc " );
                break;
            } else {
                count--;
                if (count == 0) {
                    System.out.println("登录失败，无法再继续登录");
                    System.exit(0);
                } else {
                    System.out.println("用户名或密码错误，请重新输入！");
                }
            }
        }
    }
}