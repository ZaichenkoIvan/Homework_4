package hometask.hometask7.example1;

import hometask.hometask4.helper.validator.DateValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateValidatorTest {

    @Test
    public void shouldReturnTrueIfDateCorrect() {
        DateValidator dateValidator = new DateValidator();
        assertFalse(dateValidator.validate("26.12.2000"));
        assertFalse(dateValidator.validate("35/15/3000"));
        assertFalse(dateValidator.validate("fvdsvfdvfd"));

        assertTrue(dateValidator.validate("26/12/2000"));
    }
}