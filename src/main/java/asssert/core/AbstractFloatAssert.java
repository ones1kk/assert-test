package asssert.core;

public class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF, Float>, ACTUAL> extends  AbstractObjectAssert<SELF, Float>{

    protected AbstractFloatAssert(Class<?> self, Float aFloat) {
        super(self, aFloat);
    }
}
