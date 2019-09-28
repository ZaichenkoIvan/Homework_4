package hometask.hometask4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class NameValidator implements Validator {
    private final String NAME_PATTERN = "[a-zA-Z]{2,}";

    public NameValidator() {

    }

    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}