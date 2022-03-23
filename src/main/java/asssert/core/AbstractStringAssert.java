package asssert.core;

public class AbstractStringAssert<SELF> extends AbstractInstanceAssert<SELF> {

    protected String actual;

    protected AbstractStringAssert(String actual, Class<StringAssert> stringAssertClass) {
        this.actual = actual;
    }

}
