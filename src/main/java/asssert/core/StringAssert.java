package asssert.core;

public class StringAssert extends AbstractStringAssert<StringAssert, String> {

    protected StringAssert(String actual) {
        super(StringAssert.class, actual);
    }
}
