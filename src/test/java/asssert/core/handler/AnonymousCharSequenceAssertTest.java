package asssert.core.handler;

import asssert.core.exception.AssertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnonymousCharSequenceAssertTest {

    @Test
    @DisplayName("AnonymousCharSequenceAssert methods(success)")
    void test1() {
        CharSequence actual1 = "hello";
        CharSequence actual2 = " ";
        CharSequence actual3 = "";

        AnonymousCharSequenceAssert charSequenceAssert = new AnonymousCharSequenceAssert();

        charSequenceAssert.isEmpty(actual3);
        charSequenceAssert.isNotEmpty(actual1);
        charSequenceAssert.isBlank(actual2);
        charSequenceAssert.isNotBlank(actual1);
        charSequenceAssert.isEqualToIgnoreCase(actual1, "HELLO");

    }

    @Test
    @DisplayName("AnonymousCharSequenceAssert methods(fail)")
    void test2() {
        CharSequence actual1 = "hello";
        CharSequence actual2 = " ";
        CharSequence actual3 = "";

        AnonymousCharSequenceAssert charSequenceAssert = new AnonymousCharSequenceAssert();

        Assertions.assertThrows(AssertException.class, () -> charSequenceAssert.isEmpty(actual1));
        Assertions.assertThrows(AssertException.class,
            () -> charSequenceAssert.isNotEmpty(actual3));
        Assertions.assertThrows(AssertException.class, () -> charSequenceAssert.isBlank(actual1));
        Assertions.assertThrows(AssertException.class,
            () -> charSequenceAssert.isNotBlank(actual2));
        Assertions.assertThrows(AssertException.class,
            () -> charSequenceAssert.isEqualToIgnoreCase(actual1, "world"));

    }
}