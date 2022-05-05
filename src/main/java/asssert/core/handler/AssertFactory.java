package asssert.core.handler;

public final class AssertFactory {

    public AnonymousStringAssert createAssert(String value) {
        return new AnonymousStringAssert();
    }

    public AnonymousCharacterAssert createAssert(Character value) {
        return new AnonymousCharacterAssert();
    }

    public AnonymousCharacterAssert createAssert(char value) {
        return new AnonymousCharacterAssert();
    }

    public AnonymousCharSequenceAssert createAssert(CharSequence value) {
        return new AnonymousCharSequenceAssert();
    }

    public AnonymousIntegerAssert createAssert(Integer value) {
        return new AnonymousIntegerAssert();
    }

    public AnonymousIntegerAssert createAssert(int value) {
        return new AnonymousIntegerAssert();
    }

    public AnonymousDoubleAssert createAssert(Object value) {
        return new AnonymousDoubleAssert();
    }

    public AnonymousFloatAssert createAssert(Float value) {
        return new AnonymousFloatAssert();
    }

    public AnonymousFloatAssert createAssert(float value) {
        return new AnonymousFloatAssert();
    }

    public AnonymousLongAssert createAssert(Long value) {
        return new AnonymousLongAssert();
    }

    public AnonymousLongAssert createAssert(long value) {
        return new AnonymousLongAssert();
    }

    public AnonymousByteAssert createAssert(Byte value) {
        return new AnonymousByteAssert();
    }

    public AnonymousByteAssert createAssert(byte value) {
        return new AnonymousByteAssert();
    }

    public AnonymousShortAssert createAssert(Short value) {
        return new AnonymousShortAssert();
    }

    public AnonymousShortAssert createAssert(short value) {
        return new AnonymousShortAssert();
    }

    public AnonymousNumberArrayAssert createAssert(Number[] number) {return  new AnonymousNumberArrayAssert();}

}
