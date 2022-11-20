import java.util.Scanner;

public class S5_3 {
    public static void main(String[] args) {
        int uppercase = 0;
        int lowercase = 0;
        int numberCount = 0;
        int others = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串:");
        String line = sc.nextLine();

        for (int x = 0; x < line.length(); x++) {
            //获取每一个字符
            char ch = line.charAt(x);

            if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            } else if (ch > 'A' && ch < 'Z') {
                uppercase++;
            } else if (ch > '0' && ch < '9') {
                numberCount++;
            } else {
                others++;
            }
        }
        System.out.println("小写：" + lowercase + " " + "大写：" + uppercase + " " + "数字：" + numberCount + " " + "其他：" + others);
    }
}