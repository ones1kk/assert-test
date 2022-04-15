package asssert.core.handler;

public final class AssertFactory {

    public AnonymousObjectAssert createAssert(Object value) {
        return new AnonymousObjectAssert();
    }

    public AnonymousStringAssert createAssert(String value) {
        return new AnonymousStringAssert();
    }

    public AnonymousCharacterAssert createAssert(Character value) {
        return new AnonymousCharacterAssert();
    }

}
