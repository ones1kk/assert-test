package asssert.core.handler;

public final class AssertFactory<T> {

    public static AbstractAssert createAssert(Object value) {
        Class<?> clazz = value.getClass();

        if (clazz.equals(String.class)) {
            return new AnonymousStringAssert();
        }

        if (clazz.equals(Character.class)) {
            return new AnonymousCharacterAssert();
        }
        return null;
    }

}
