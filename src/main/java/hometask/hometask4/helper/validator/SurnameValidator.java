package hometask.hometask4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SurnameValidator implements Validator {
    private final String SURNAME_PATTERN = "[a-zA-Z]{1,}";

    public SurnameValidator() {

    }

    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(SURNAME_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
