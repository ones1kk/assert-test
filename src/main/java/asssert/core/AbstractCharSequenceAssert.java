package asssert.core;

import asssert.core.handler.AnonymousCharSequenceAssert;

public class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends
    AbstractObjectAssert<SELF, ACTUAL> {

    protected AnonymousCharSequenceAssert charSequenceAssert;

    protected AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.charSequenceAssert = assertFactory.createAssert(actual);
    }

    public SELF isEmpty() {
        this.charSequenceAssert.isEmpty(actual);
        return self;
    }

    public SELF isNotEmpty() {
        this.charSequenceAssert.isNotEmpty(actual);
        return self;
    }

    public SELF isBlank() {
        this.charSequenceAssert.isBlank(actual);
        return self;
    }

    public SELF isNotBlank() {
        this.charSequenceAssert.isNotBlank(actual);
        return self;
    }

    public SELF isEqualToIgnoreCase(CharSequence expected) {
        this.charSequenceAssert.isEqualToIgnoreCase(actual, expected);
        return self;
    }

}
