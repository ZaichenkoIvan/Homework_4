package hometask.hometask4.helper.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseValidator implements Validator {
    private final String NAME_PATTERN = "[1-6]{1}";

    public CourseValidator() {

    }

    @Override
    public boolean validate(final String hex) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
