package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class AnonymousStringAssert<T> extends AnonymousCharSequenceAssert<T> {

    protected AnonymousStringAssert(Class<T> type) {
        super(type);
    }

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
