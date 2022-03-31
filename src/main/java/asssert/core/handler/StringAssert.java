package asssert.core.handler;

import org.apache.commons.lang3.StringUtils;

public class StringAssert<SELF, ACTUAL> extends CharSequenceAssert<SELF, ACTUAL> {

    protected StringAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
    }

    public SELF isEmpty(String actaul) {
        boolean result = StringUtils.isEmpty(actaul);
        if (!result) {
            throw exception;
        }
        return self;
    }

    public SELF isNotEmpty(String actaul) {
        boolean result = StringUtils.isNotEmpty(actaul);
        if (!result) {
            throw exception;
        }
        return self;
    }

}
