package asssert.core;

public class StringAssert extends AbstractStringAssert<StringAssert, String> {

    protected StringAssert(String actual) {
        super(actual, new StringAssert());
        System.out.println("StringAssert.StringAssert = "+ actual);
    }


    protected StringAssert() {
        super();
    }
}
