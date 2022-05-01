package asssert.core.feature;

public interface NumberAssert<ACTUAL extends Number> {

    void isPositive(ACTUAL actual);

    void isNotPositive(ACTUAL actual);

    void isNegative(ACTUAL actual);

    void isNotNegative(ACTUAL actual);

    void isZero(ACTUAL actual);

    void isNotZero(ACTUAL actual);

    void isCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

    void isNotCloseTo(ACTUAL actual, ACTUAL expected, Offset<ACTUAL> offset);

}
