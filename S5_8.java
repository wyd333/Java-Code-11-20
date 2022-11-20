import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class S5_8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher("中华人民共和国成立于1949年10月1日");
        matcher.find();
        System.out.println(matcher.replaceAll("").trim());
    }
}
