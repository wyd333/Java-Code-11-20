import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class S5_8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher("�л����񹲺͹�������1949��10��1��");
        matcher.find();
        System.out.println(matcher.replaceAll("").trim());
    }
}
