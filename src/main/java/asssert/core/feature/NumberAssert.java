package asssert.core.feature;

public interface NumberAssert<ELEMENT extends Number> {

    void isPositive(ELEMENT actual);

    void isNotPositive(ELEMENT actual);

    void isNegative(ELEMENT actual);

    void isNotNegative(ELEMENT actual);

    void isZero(ELEMENT actual);

    void isNotZero(ELEMENT actual);

    void isCloseTo(ELEMENT actual, ELEMENT expected, Offset<ELEMENT> offset);

    void isNotCloseTo(ELEMENT actual, ELEMENT expected, Offset<ELEMENT> offset);

}
