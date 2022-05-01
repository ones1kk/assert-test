package asssert.core;

import asssert.core.feature.Offset;
import asssert.core.handler.AnonymousByteAssert;

public class AbstractByteAssert<SELF extends AbstractByteAssert<SELF, Byte>, ACTUAL> extends AbstractObjectAssert<SELF, Byte>  {

    protected AnonymousByteAssert byteAssert;

    protected AbstractByteAssert(Class<?> self, Byte actual) {
        super(self, actual);
        this.byteAssert = assertFactory.createAssert(actual);
    }

    public SELF isPositive() {
        this.byteAssert.isPositive(actual);
        return self;
    }

    public SELF isNotPositive() {
        this.byteAssert.isNotPositive(actual);
        return self;
    }

    public SELF isNegative() {
        this.byteAssert.isNegative(actual);
        return self;
    }

    public SELF isNotNegative() {
        this.byteAssert.isNotNegative(actual);
        return self;
    }

    public SELF isZero() {
        this.byteAssert.isZero(actual);
        return self;
    }

    public SELF isNotZero() {
        this.byteAssert.isNotZero(actual);
        return self;
    }

    public SELF isCloseTo(Byte expected, Offset<Byte> offset) {
        this.byteAssert.isCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isNotCloseTo(Byte expected, Offset<Byte> offset) {
        this.byteAssert.isNotCloseTo(actual, expected, offset);
        return self;
    }

    public SELF isEven() {
        this.byteAssert.isEven(actual);
        return self;
    }

    public SELF isOdd() {
        this.byteAssert.isOdd(actual);
        return self;
    }

    public SELF isLessThan(Byte expected) {
        this.byteAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Byte expected) {
        this.byteAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Byte expected) {
        this.byteAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Byte expected) {
        this.byteAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Byte start, Byte end) {
        this.byteAssert.isBetween(actual, start, end);
        return self;
    }

}
