package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class AnonymousStringAssert extends AnonymousCharSequenceAssert {

    public void isEmpty(String actual) {
        boolean result = StringUtils.isEmpty(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

    public void isNotEmpty(String actual) {
        boolean result = StringUtils.isNotEmpty(actual);
        if (!result) {
            this.message  = "isNull";
            throw getException(message);
        }
    }

}
