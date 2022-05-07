package asssert.core;

public interface InterfaceAssert<SELF, ACTUAL> {

    SELF isNull();

    SELF isNotNull();

    SELF isSameAs(ACTUAL expected);

    SELF isEqualTo(ACTUAL expected);

    SELF isNotEqualTo(ACTUAL expected);

    SELF isAssignableFrom(Class<?> expected);

}
