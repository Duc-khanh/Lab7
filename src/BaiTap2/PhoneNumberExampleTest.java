package BaiTap2;

public class PhoneNumberExampleTest {

    public static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[]{ "(84)-(0901234566)","(84)-(0901234567)"};
    public static final String[] invalidPhoneNumber = new String[]{"091.123.4567", "(84)091.123.4567"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + " is valid: " + isValid);
        }
    }
}
