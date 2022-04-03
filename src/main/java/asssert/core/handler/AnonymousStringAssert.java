package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class AnonymousStringAssert extends AnonymousCharSequenceAssert {


    public void isEmpty(String actaul) {
        boolean result = StringUtils.isEmpty(actaul);
        if (!result) {
            throw exception;
        }
    }

    public void isNotEmpty(String actaul) {
        boolean result = StringUtils.isNotEmpty(actaul);
        if (!result) {
            throw exception;
        }
    }

}
