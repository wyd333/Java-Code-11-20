import java.util.Random;
import java.util.Scanner;

public class S5_5 {
    public static void main(String[] args) {
        //������֤��
        Random verCode = new Random();
        String verCode2 = "";   //����һ���յ�String  ������֤��
        for (int i = 0; i < 6; i++) {   //ѭ��6��ÿ������һλ��6λ��֤��
            int a = verCode.nextInt(3); //��֤��������֡���Сд��ĸ���
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
        System.out.println("������ɵ���֤��Ϊ:" + verCode2);

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if(input.equalsIgnoreCase(verCode2)) {
            System.out.println("��ϲ��֤�ɹ���");
        } else {
            System.out.println("��֤ʧ�ܣ�");
        }
    }
}