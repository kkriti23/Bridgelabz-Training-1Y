package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example {
    static void main() {
        String regexp = "^[a-z]+[A-Z]+[0-9]+\\W+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("aA1*");
        if(matcher.matches())
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}
