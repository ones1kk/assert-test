package asssert.core;

import asssert.core.handler.AnonymousNumberArrayAssert;
import java.util.function.Predicate;

public class AbstractNumberArrayAssert<SELF extends AbstractNumberArrayAssert<SELF, Number[]>, ACTUAL> extends
    AbstractObjectAssert<SELF, Number[]> {

    protected AnonymousNumberArrayAssert numberArrayAssert;

    protected AbstractNumberArrayAssert(Class<?> self, Number[] actual) {
        super(self, actual);
        this.numberArrayAssert = assertFactory.createAssert(actual);
        castType(actual);
    }

    private void castType(Number[] actual) {
        if (actual instanceof Integer[]) {
            actual = (Integer[]) this.actual;
        }
        if (actual instanceof Double[]) {
            actual = (Double[]) this.actual;
        }
        if (actual instanceof Long[]) {
            actual = (Long[]) this.actual;
        }
        if (actual instanceof Float[]) {
            actual = (Float[]) this.actual;
        }
        if (actual instanceof Byte[]) {
            actual = (Byte[]) this.actual;
        }
        if (actual instanceof Short[]) {
            actual = (Short[]) this.actual;
        }
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

    public SELF contains(Number expected) {
        this.numberArrayAssert.contains(actual, expected);
        return self;
    }

    public SELF doesNotContain(Number expected) {
        this.numberArrayAssert.doesNotContain(actual, expected);
        return self;
    }

    public SELF containsAll(Number... expected) {
        this.numberArrayAssert.containsAll(actual, expected);
        return self;
    }

    public SELF containsAny(Number... expected) {
        this.numberArrayAssert.containsAny(actual, expected);
        return self;
    }

    public SELF containsNull() {
        this.numberArrayAssert.containsNull(actual);
        return self;
    }

    public SELF doesNotContainNull() {
        this.numberArrayAssert.doesNotContainNull(actual);
        return self;
    }

    public SELF allMatch(Predicate<Number[]> expected) {
        this.numberArrayAssert.allMatch(actual, expected);
        return self;
    }

    public SELF noneMatch(Predicate<Number[]> expected) {
        this.numberArrayAssert.noneMatch(actual, expected);
        return self;
    }

    public SELF isMax(Number expected) {
        this.numberArrayAssert.isMax(actual, expected);
        return self;
    }

    public SELF isMin(Number expected) {
        this.numberArrayAssert.isMin(actual, expected);
        return self;
    }

}
