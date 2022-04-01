package asssert.core.handler;

public final class AssertFactory {

    public static  AbstractAssert<?> createAssert(Object value) {
        Class<?> clazz = value.getClass();

        if (clazz.equals(String.class)) {
            return new AnonymousStringAssert<>(AnonymousStringAssert.class);
        }

        if (clazz.equals(Character.class)) {
            return new AnonymousCharacterAssert<>(AnonymousCharacterAssert.class);
        }
        return null;
    }

}
