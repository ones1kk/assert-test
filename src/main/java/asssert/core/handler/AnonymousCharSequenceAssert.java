package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class AnonymousCharSequenceAssert extends AbstractAssert {

    public void isEmpty(String actual) {
        boolean result = StringUtils.isEmpty(actual);
        this.defaultDescription = actual + " is not empty";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }

    public void isNotEmpty(String actual) {
        boolean result = StringUtils.isNotEmpty(actual);
        this.defaultDescription = actual + " is empty";
        if (!result) {
            String description = setDescription();
            throw getException(setDefaultText(actual, null, description));
        }
    }
}
