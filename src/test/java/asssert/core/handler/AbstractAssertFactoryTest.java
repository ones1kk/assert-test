package asssert.core.handler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractAssertFactoryTest {

    @Test
    @DisplayName("AssertFactory getting type")
    void test1() {
        String actual1 = "hello";

        AnonymousStringAssert<String> stringAssert = (AnonymousStringAssert<String>) AssertFactory.createAssert(actual1);
        stringAssert.isNotEmpty(actual1);

        char actual2 = 'a';
        AnonymousCharacterAssert<Character> characterAssert = (AnonymousCharacterAssert<Character>) AssertFactory.createAssert(actual2);
        characterAssert.isLowerCase(actual2);
    }

}