package asssert.core;

public abstract class AbstractCharSequenceAssert<SELF extends AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL> extends
    AbstractObjectAssert<SELF, ACTUAL> {

    protected AbstractCharSequenceAssert(Class<?> self, ACTUAL actual) {
        super(self, actual);
    }


}
