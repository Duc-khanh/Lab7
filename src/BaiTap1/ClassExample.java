package BaiTap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String ACCOUNT_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public ClassExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
