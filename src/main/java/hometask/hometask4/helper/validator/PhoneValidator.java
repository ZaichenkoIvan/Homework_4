package hometask.hometask4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneValidator implements Validator {
    private final String PHONE_PATTERN = "[0-9]{12}";

    public PhoneValidator() {

    }

    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
