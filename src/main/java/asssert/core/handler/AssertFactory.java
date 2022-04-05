package asssert.core.handler;

public final class AssertFactory {

    public static AnonymousObjectAssert createAssert(Object value) {
        return new AnonymousObjectAssert();
    }

    public static AnonymousStringAssert createAssert(String value) {
        return new AnonymousStringAssert();
    }

    public static AnonymousCharacterAssert createAssert(Character value) {
        return new AnonymousCharacterAssert();
    }

}
