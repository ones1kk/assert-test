package asssert.core;

import asssert.core.handler.AnonymousStringAssert;

public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends
    AbstractCharSequenceAssert<SELF, String> {

    protected AnonymousStringAssert stringAssert;

    protected AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.stringAssert = assertFactory.createAssert(actual);
    }

    public SELF isEmpty() {
        this.stringAssert.isEmpty(actual);
        return self;
    }

    public SELF isNotEmpty() {
        this.stringAssert.isNotEmpty(actual);
        return self;
    }

}
