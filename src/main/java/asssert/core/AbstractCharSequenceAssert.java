package asssert.core;

import asssert.core.handler.AnonymousCharSequenceAssert;

public abstract class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends CharSequence> extends
    AbstractObjectAssert<SELF, ACTUAL> {

    protected AnonymousCharSequenceAssert charSequenceAssert;

    protected AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
        this.charSequenceAssert = assertFactory.createAssert(actual);
    }

    public SELF isEmpty() {
        this.charSequenceAssert.isEmpty((String) actual);
        return self;
    }

    public SELF isNotEmpty() {
        this.charSequenceAssert.isNotEmpty((String) actual);
        return self;
    }


}
