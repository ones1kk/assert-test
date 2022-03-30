package asssert.core;

public class AbstractStringAssert<SELF extends AbstractStringAssert<SELF>> extends
    AbstractCharSequenceAssert<SELF, String> {

    protected AbstractStringAssert(Class<?> self, String actual) {
        super(self, actual);
    }

    public SELF isEmpty() {
        assert actual.toString().isEmpty();
        return self;
    }

    public SELF isNotEmpty() {
        assert !actual.toString().isEmpty();
        return self;
    }
}
