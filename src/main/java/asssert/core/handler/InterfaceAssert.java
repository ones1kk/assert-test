package asssert.core.handler;

public interface InterfaceAssert {

    void isNull(Object actual);

    void isNotNull(Object actual);

    void isSameAs(Object actual, Object expected);

    void isEqualTo(Object actual, Object expected);

    void isNotEqualTo(Object actual, Object expected);

    void isAssignableFrom(Object actual, Class<?> expected);

}
