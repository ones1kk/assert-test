package asssert.core;

import asssert.core.feature.Offset;
import asssert.core.handler.AnonymousShortAssert;

public class AbstractShortAssert<SELF extends AbstractShortAssert<SELF, Short>, ACTUAL> extends  AbstractObjectAssert<SELF, Short>{

    protected AnonymousShortAssert shortAssert;

    protected AbstractShortAssert(Class<?> self, Short actual) {
        super(self, actual);
        this.shortAssert = assertFactory.createAssert(actual);
    }

    public SELF isPositive() {
        this.shortAssert.isPositive(actual);
        return self;
    }

    public SELF isNotPositive() {
        this.shortAssert.isNotPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.shortAssert.isNegative(actual);
        return self;
    }

    public SELF isNotNegative() {
        this.shortAssert.isNotNegative(actual);
        return self;
    }

    public SELF isZero() {
        this.shortAssert.isZero(actual);
        return self;
    }

    public SELF isNotZero() {
        this.shortAssert.isNotZero(actual);
        return self;
    }

    public SELF isCloseTo(Short expected, Offset<Short> offset) {
        this.shortAssert.isCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isNotCloseTo(Short expected, Offset<Short> offset) {
        this.shortAssert.isNotCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isEven() {
        this.shortAssert.isEven(actual);
        return self;
    }

    public SELF isOdd() {
        this.shortAssert.isOdd(actual);
        return self;
    }

    public SELF isLessThan(Short expected) {
        this.shortAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Short expected) {
        this.shortAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Short expected) {
        this.shortAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Short expected) {
        this.shortAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Short start, Short end) {
        this.shortAssert.isBetween(actual, start, end);
        return self;
    }
}
