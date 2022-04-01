package asssert.core;

public interface InterfaceObjectAssert<SELF, ACTUAL> {

    SELF isNull();

    SELF isNotNull();

    SELF isSameAs(ACTUAL expected);

    SELF isEqualTo(ACTUAL expected);

    SELF isNotEqualTo(ACTUAL expected);

    SELF isInstanceOf(Class<?> expected);

}
