package asssert.core.feature;

public interface ComparableAssert<ELEMENT> {

    void isLessThan(ELEMENT actual, ELEMENT expected);

    void isLessThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    void isGreaterThan(ELEMENT actual, ELEMENT expected);

    void isGreaterThanOrEqualTo(ELEMENT actual, ELEMENT expected);

    void isBetween(ELEMENT actual, ELEMENT start, ELEMENT end);

}