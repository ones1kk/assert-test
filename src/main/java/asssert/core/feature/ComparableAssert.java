package asssert.core.feature;

public interface ComparableAssert<ACTUAL> {

    void isLessThan(ACTUAL actual, ACTUAL expected);

    void isLessThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void isGreaterThan(ACTUAL actual, ACTUAL expected);

    void isGreaterThanOrEqualTo(ACTUAL actual, ACTUAL expected);

    void isBetween(ACTUAL actual, ACTUAL start, ACTUAL end);

}