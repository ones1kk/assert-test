package asssert.core.handler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractAssertFactoryTest {

    @Test
    @DisplayName("AssertFactory getting type")
    void test1() {
        AssertFactory assertFactory = new AssertFactory();
        String actual1 = "hello";

        AnonymousStringAssert stringAssert = (AnonymousStringAssert) assertFactory.createAssert(
            actual1);
        stringAssert.isNotEmpty(actual1);

        char actual2 = 'a';
        AnonymousCharacterAssert characterAssert = (AnonymousCharacterAssert) assertFactory.createAssert(
            actual2);
        characterAssert.isLowerCase(actual2);
    }

}