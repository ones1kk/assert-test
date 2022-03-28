package asssert.core;

public class StringAssert<SELF extends AbstractInstanceAssert<SELF, String>> extends AbstractStringAssert<SELF, String>{

    protected StringAssert(String actual) {
        super(null, actual);
    }

}
