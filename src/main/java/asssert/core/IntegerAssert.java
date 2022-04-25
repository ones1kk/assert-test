package asssert.core;

public class IntegerAssert extends AbstractIntegerAssert<IntegerAssert, Integer> {

    protected IntegerAssert(Class<?> self, Integer actual) {
        super(IntegerAssert.class, actual);
    }
}
