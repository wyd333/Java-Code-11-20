public class S5_4_1 {
    public static void main(String[] args) {
        String str = "12345abcd";
        StringBuffer sb = new StringBuffer(str);
        str = sb.reverse().toString();
        System.out.println(str);
    }
}
