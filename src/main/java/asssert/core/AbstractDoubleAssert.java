package asssert.core;

import asssert.core.feature.ComparableAssert;
import asssert.core.handler.AnonymousDoubleAssert;

public class AbstractDoubleAssert<SELF extends AbstractDoubleAssert<SELF, Double>, ACTUAL > extends AbstractObjectAssert<SELF, Double> {

    protected AnonymousDoubleAssert doubleAssert;

    protected AbstractDoubleAssert(Class<?> self, Double actual) {
        super(self, actual);
        this.doubleAssert = assertFactory.createAssert(actual);
    }

    public SELF isInfinity() {
        this.doubleAssert.isInfinity(actual);
        return self;
    }

    public SELF isFinite() {
        this.doubleAssert.isFinite(actual);
        return self;
    }

    public SELF isNaN() {
        this.doubleAssert.isNaN(actual);
        return self;
    }

    public SELF isPositive() {
        this.doubleAssert.isPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.doubleAssert.isNegative(actual);
        return self;
    }

    public SELF isLessThan(Double expected) {
        this.doubleAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Double expected) {
        this.doubleAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Double expected) {
        this.doubleAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Double expected) {
        this.doubleAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Double start, Double end) {
        this.doubleAssert.isBetween(actual, start, end);
        return self;
    }

}
