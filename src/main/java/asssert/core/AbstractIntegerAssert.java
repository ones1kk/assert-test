package asssert.core;

import asssert.core.feature.Offset;
import asssert.core.handler.AnonymousIntegerAssert;

public class AbstractIntegerAssert<SELF extends AbstractIntegerAssert<SELF, Integer>, ACTUAL> extends
    AbstractObjectAssert<SELF, Integer> {

    protected AnonymousIntegerAssert integerAssert;

    protected AbstractIntegerAssert(Class<?> self, Integer actual) {
        super(self, actual);
        this.integerAssert = assertFactory.createAssert(actual);
    }

    public SELF isPositive() {
        this.integerAssert.isPositive(actual);
        return self;
    }

    public SELF isNotPositive() {
        this.integerAssert.isNotPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.integerAssert.isNegative(actual);
        return self;
    }

    public SELF isNotNegative() {
        this.integerAssert.isNotNegative(actual);
        return self;
    }

    public SELF isZero() {
        this.integerAssert.isZero(actual);
        return self;
    }

    public SELF isNotZero() {
        this.integerAssert.isNotZero(actual);
        return self;
    }

    public SELF isCloseTo(Integer expected, Offset<Integer> offset) {
        this.integerAssert.isCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isNotCloseTo(Integer expected, Offset<Integer> offset) {
        this.integerAssert.isNotCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isEven() {
        this.integerAssert.isEven(actual);
        return self;
    }

    public SELF isOdd() {
        this.integerAssert.isOdd(actual);
        return self;
    }

    public SELF isLessThan(Integer expected) {
        this.integerAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Integer expected) {
        this.integerAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Integer expected) {
        this.integerAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Integer expected) {
        this.integerAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Integer start, Integer end) {
        this.integerAssert.isBetween(actual, start, end);
        return self;
    }
}
