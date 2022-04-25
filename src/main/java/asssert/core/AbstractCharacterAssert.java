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

    public SELF isLessThan(Character expected) {
        this.characterAssert.isLessThan(actual, expected);
        return self;
    }

    public SELF isLessThanOrEqualTo(Character expected) {
        this.characterAssert.isLessThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isGreaterThan(Character expected) {
        this.characterAssert.isGreaterThan(actual, expected);
        return self;
    }

    public SELF isGreaterThanOrEqualTo(Character expected) {
        this.characterAssert.isGreaterThanOrEqualTo(actual, expected);
        return self;
    }

    public SELF isBetween(Character start, Character end) {
        this.characterAssert.isBetween(actual, start, end);
        return self;
    }
}
