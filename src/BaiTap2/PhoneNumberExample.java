package BaiTap2;

import BaiTap1.ClassExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneNumberExample() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
