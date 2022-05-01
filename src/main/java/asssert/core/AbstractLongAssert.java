package asssert.core;

import asssert.core.feature.Offset;
import asssert.core.handler.AnonymousLongAssert;

public class AbstractLongAssert<SELF extends AbstractLongAssert<SELF, Long>, ACTUAL> extends AbstractObjectAssert<SELF, Long> {

    protected AnonymousLongAssert longAssert;

    protected AbstractLongAssert(Class<?> self, Long aLong) {
        super(self, aLong);
        this.longAssert = assertFactory.createAssert(actual);
    }

    public SELF isPositive() {
        this.longAssert.isPositive(actual);
        return self;
    }

    public SELF isNotPositive() {
        this.longAssert.isNotPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.longAssert.isNegative(actual);
        return self;
    }

    public SELF isNotNegative() {
        this.longAssert.isNotNegative(actual);
        return self;
    }

    public SELF isZero() {
        this.longAssert.isZero(actual);
        return self;
    }

    public SELF isNotZero() {
        this.longAssert.isNotZero(actual);
        return self;
    }

    public SELF isCloseTo(Long expected, Offset<Long> offset) {
        this.longAssert.isCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isNotCloseTo(Long expected, Offset<Long> offset) {
        this.longAssert.isNotCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isEven() {
        this.longAssert.isEven(actual);
        return self;
    }

    public SELF isOdd() {
        this.longAssert.isOdd(actual);
        return self;
    }

    public SELF isLessThan(Long expected) {
        this.longAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Long expected) {
        this.longAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Long expected) {
        this.longAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Long expected) {
        this.longAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Long start, Long end) {
        this.longAssert.isBetween(actual, start, end);
        return self;
    }
}
