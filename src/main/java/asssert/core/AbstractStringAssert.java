package asssert.core;

import asssert.core.handler.AnonymousStringAssert;

public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends
    AbstractCharSequenceAssert<SELF, String> {

    protected AnonymousStringAssert stringAssert;

    protected AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
        this.stringAssert = assertFactory.createAssert(actual);
    }

    public SELF isLessThan(String expected) {
        this.stringAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(String expected) {
        this.stringAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(String expected) {
        this.stringAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(String expected) {
        this.stringAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(String start, String end) {
        this.stringAssert.isBetween(actual, start, end);
        return self;
    }


}
