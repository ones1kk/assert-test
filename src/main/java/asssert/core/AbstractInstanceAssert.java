package asssert.core;

public abstract class AbstractInstanceAssert<ACTUAL> {

    protected ACTUAL actual;

    protected AbstractInstanceAssert<ACTUAL> as() {
        return this;
    }


}
