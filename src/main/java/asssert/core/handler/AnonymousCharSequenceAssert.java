package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class AnonymousCharSequenceAssert extends AnonymousObjectAssert {

    public void isEmpty(CharSequence actual) {
        boolean result = StringUtils.isEmpty(actual);
        this.defaultDescription = String.format("%s is not empty", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isNotEmpty(CharSequence actual) {
        boolean result = StringUtils.isNotEmpty(actual);
        this.defaultDescription = String.format("%s is empty", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isBlank(CharSequence actual) {
        boolean result = StringUtils.isBlank(actual);
        this.defaultDescription = String.format("%s is not blank", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isNotBlank(CharSequence actual) {
        boolean result = StringUtils.isNotBlank(actual);
        this.defaultDescription = String.format("%s is blank", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isEqualToIgnoreCase(CharSequence actual, CharSequence expected) {
        boolean result = StringUtils.equalsIgnoreCase(actual, expected);
        this.defaultDescription = String.format("%s is not equal as ignore case", actual);
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

}
