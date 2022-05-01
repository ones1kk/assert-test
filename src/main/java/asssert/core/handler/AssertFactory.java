package asssert.core.handler;

public final class AssertFactory {

    public AnonymousStringAssert createAssert(String value) {
        return new AnonymousStringAssert();
    }

    public AnonymousCharacterAssert createAssert(Character value) {
        return new AnonymousCharacterAssert();
    }

    public AnonymousCharSequenceAssert createAssert(CharSequence value) {
        return new AnonymousCharSequenceAssert();
    }

    public AnonymousIntegerAssert createAssert(Integer value) {
        return new AnonymousIntegerAssert();
    }

    public AnonymousDoubleAssert createAssert(Object value) {
        return new AnonymousDoubleAssert();
    }

    public AnonymousFloatAssert createAssert(Float value) {
        return new AnonymousFloatAssert();
    }

    public AnonymousLongAssert createAssert(Long value) {
        return new AnonymousLongAssert();
    }

}
