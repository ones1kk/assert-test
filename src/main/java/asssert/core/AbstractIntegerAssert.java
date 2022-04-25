package asssert.core;

import asssert.core.handler.AnonymousIntegerAssert;

public class AbstractIntegerAssert<SELF extends AbstractIntegerAssert<SELF, Integer>, ACTUAL> extends
    AbstractObjectAssert<SELF, Integer> {

    protected AnonymousIntegerAssert integerAssert;

    protected AbstractIntegerAssert(Class<?> self, Integer actual) {
        super(self, actual);
        this.integerAssert = assertFactory.createAssert(actual);
    }
}
