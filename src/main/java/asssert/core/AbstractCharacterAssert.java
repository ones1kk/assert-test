package asssert.core;

import asssert.core.handler.AnonymousCharacterAssert;

public class AbstractCharacterAssert<SELF extends AbstractCharacterAssert<SELF, Character>, ACTUAL> extends
    AbstractObjectAssert<SELF, Character> {

    protected AnonymousCharacterAssert characterAssert;

    protected AbstractCharacterAssert(Class<?> self, Character actual) {
        super(self, actual);
        this.characterAssert = assertFactory.createAssert(actual);
    }

    public SELF isUpperCase() {
        this.characterAssert.isUpperCase(actual);
        return self;
    }

    public SELF isLowerCase() {
        this.characterAssert.isLowerCase(actual);
        return self;
    }

    public SELF isLetter() {
        this.characterAssert.isLowerCase(actual);
        return self;
    }

    public SELF isDigit() {
        this.characterAssert.isDigit(actual);
        return self;
    }

    public SELF isWhitespace() {
        this.characterAssert.isWhitespace(actual);
        return self;
    }
}
