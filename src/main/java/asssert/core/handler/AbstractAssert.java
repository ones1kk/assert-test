package asssert.core.handler;

public abstract class AbstractAssert<ACTUAL> implements Assert<ACTUAL> {

    protected final ACTUAL actual;

    protected final RuntimeException exception = new RuntimeException();


    protected AbstractAssert(ACTUAL actual) {
        this.actual = actual;
    }

}
