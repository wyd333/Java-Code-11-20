import java.util.Random;
import java.util.Scanner;

public class S5_5 {
    public static void main(String[] args) {
        //生成验证码
        Random verCode = new Random();
        String verCode2 = "";   //定义一个空的String  接收验证码
        for (int i = 0; i < 6; i++) {   //循环6次每次生成一位，6位验证码
            int a = verCode.nextInt(3); //验证码包括数字、大小写字母组成
            switch (a) {
                case 0:
                    char s = (char) (verCode.nextInt(26) + 65);
                    verCode2 = verCode2 + s;
                    break;
                case 1:
                    char s1 = (char) (verCode.nextInt(26) + 97);
                    verCode2 = verCode2 + s1;
                    break;
                case 2:
                    int s2 = verCode.nextInt(10);
                    verCode2 = verCode2 + s2;
                    break;
            }
        }
        System.out.println("随机生成的验证码为:" + verCode2);

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if(input.equalsIgnoreCase(verCode2)) {
            System.out.println("恭喜验证成功！");
        } else {
            System.out.println("验证失败！");
        }
    }
}