package asssert.core;

import static org.junit.jupiter.api.Assertions.*;

import asssert.Assertion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractNumberArrayAssertTest {

    @Test
    @DisplayName("Basic Test(success)")
    void test1() {
        Integer[] actual1 = new Integer[]{1,2,3};
        Integer[] actual2 = new Integer[]{};

        Assertion.assertThat(actual1).isNotEmpty();
        Assertion.assertThat(actual2).isEmpty();
        Assertion.assertThat(actual2).isNullOrEmpty();
        Assertion.assertThat(actual1).contains(1,2,3);
        Assertion.assertThat(actual1).contains(1);

        Double[] actual3 = new Double[]{1.1, 1.2, 1.3};
        Double[] actual4 = new Double[]{};

        Assertion.assertThat(actual3).isNotEmpty();
        Assertion.assertThat(actual4).isEmpty();
        Assertion.assertThat(actual4).isNullOrEmpty();
        Assertion.assertThat(actual3).contains(1.1, 1.2, 1.3);
        Assertion.assertThat(actual3).contains(1.1);

        Long[] actual5 = new Long[]{1L, 2L, 3L};
        Long[] actual6 = new Long[]{};

        Assertion.assertThat(actual5).isNotEmpty();
        Assertion.assertThat(actual6).isEmpty();
        Assertion.assertThat(actual6).isNullOrEmpty();
        Assertion.assertThat(actual5).contains(1L, 2L, 3L);
        Assertion.assertThat(actual5).contains(1L);

        Short[] actual7 = new Short[]{1, 2, 3};
        Short[] actual8 = new Short[]{};

        Assertion.assertThat(actual7).isNotEmpty();
        Assertion.assertThat(actual8).isEmpty();
        Assertion.assertThat(actual8).isNullOrEmpty();
        Assertion.assertThat(actual7).contains((short)1, (short)2, (short)3);
        Assertion.assertThat(actual7).contains((short)1);

        Float[] actual9 = new Float[]{1.1F, 1.2F, 1.3F};
        Float[] actual10 = new Float[]{};

        Assertion.assertThat(actual9).isNotEmpty();
        Assertion.assertThat(actual10).isEmpty();
        Assertion.assertThat(actual10).isNullOrEmpty();
        Assertion.assertThat(actual9).contains(1.1F, 1.2F, 1.3F);
        Assertion.assertThat(actual9).contains(1.1F);

        Byte[] actual11 = new Byte[]{1, 2, 3};
        Byte[] actual12 = new Byte[]{};

        Assertion.assertThat(actual11).isNotEmpty();
        Assertion.assertThat(actual12).isEmpty();
        Assertion.assertThat(actual12).isNullOrEmpty();
        Assertion.assertThat(actual11).contains((byte)1, (byte)2, (byte)3);
        Assertion.assertThat(actual11).contains((byte)1);

    }
}