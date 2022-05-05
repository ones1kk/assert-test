package asssert.core.feature;

import java.util.function.Predicate;

public interface IterableAssert<ACTUAL, EXPECTED> {

    void isEmpty(ACTUAL actual);

    void isNotEmpty(ACTUAL actual);

    void isNullOrEmpty(ACTUAL actual);

    void hasElement(ACTUAL actual, ACTUAL expected);

    void contains(ACTUAL actual, EXPECTED... expected);

    void contains(ACTUAL actual, EXPECTED expected);

    void containsAll(ACTUAL actual, EXPECTED... expected);

    void containsAny(ACTUAL actual, EXPECTED... expected);

    void containsNull(ACTUAL actual, ACTUAL expected);

    void allMatch(ACTUAL actual, Predicate<ACTUAL> expected);

    void noneMatch(ACTUAL actual, Predicate<ACTUAL> expected);


}
