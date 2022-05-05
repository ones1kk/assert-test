package asssert.core;

import asssert.core.handler.AnonymousNumberArrayAssert;
import java.util.Arrays;

public class AbstractNumberArrayAssert<SELF extends AbstractNumberArrayAssert<SELF, Number[]>, ACTUAL> extends AbstractObjectAssert<SELF, Number[]>{

    protected AnonymousNumberArrayAssert numberArrayAssert;

    protected AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrayAssert = assertFactory.createAssert(actual);
        castType(actual);
    }

    private void castType(Number[] actual) {
        if(actual instanceof Integer[]) actual = (Integer[]) actual;
        if(actual instanceof Double[]) actual = (Double[]) actual;
        if(actual instanceof Long[]) actual = (Long[]) actual;
        if(actual instanceof Float[]) actual = (Float[]) actual;
        if(actual instanceof Byte[]) actual = (Byte[]) actual;
        if(actual instanceof Short[]) actual = (Short[]) actual;
    }

    public SELF isEmpty() {
        this.numberArrayAssert.isEmpty(actual);
        return self;
    }

    public SELF isNotEmpty() {
        this.numberArrayAssert.isNotEmpty(actual);
        return self;
    }

    public SELF isNullOrEmpty() {
        this.numberArrayAssert.isNullOrEmpty(actual);
        return self;
    }

    public SELF contains(Number... expected) {
        this.numberArrayAssert.contains(actual, expected);
        return self;
    }

    public SELF contains(Number expected) {
        this.numberArrayAssert.contains(actual, expected);
        return self;
    }


}
