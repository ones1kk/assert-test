package asssert.core;

import asssert.core.feature.Offset;
import asssert.core.handler.AnonymousFloatAssert;

public class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF, Float>, ACTUAL> extends
    AbstractObjectAssert<SELF, Float> {

    protected AnonymousFloatAssert floatAssert;

    protected AbstractFloatAssert(Class<?> self, Float actual) {
        super(self, actual);
        this.floatAssert = assertFactory.createAssert(actual);
    }

    public SELF isPositive() {
        this.floatAssert.isPositive(actual);
        return self;
    }

    public SELF isNotPositive() {
        this.floatAssert.isNotPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.floatAssert.isNegative(actual);
        return self;
    }

    public SELF isNotNegative() {
        this.floatAssert.isNotNegative(actual);
        return self;
    }

    public SELF isZero() {
        this.floatAssert.isZero(actual);
        return self;
    }

    public SELF isNotZero() {
        this.floatAssert.isNotZero(actual);
        return self;
    }

    public SELF isCloseTo(Float expected, Offset<Float> offset) {
        this.floatAssert.isCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isNotCloseTo(Float expected, Offset<Float> offset) {
        this.floatAssert.isNotCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isInfinity() {
        this.floatAssert.isInfinity(actual);
        return self;
    }

    public SELF isFinite() {
        this.floatAssert.isFinite(actual);
        return self;
    }

    public SELF isNaN() {
        this.floatAssert.isNaN(actual);
        return self;
    }

    public SELF isLessThan(Float expected) {
        this.floatAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Float expected) {
        this.floatAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Float expected) {
        this.floatAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Float expected) {
        this.floatAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Float start, Float end) {
        this.floatAssert.isBetween(actual, start, end);
        return self;
    }

}
