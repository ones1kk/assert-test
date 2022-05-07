package asssert.core;

import asssert.Assertion;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractNumberArrayAssertTest {

    @Test
    @DisplayName("AbstractNumberArrayAssertTest(success)")
    void test1() {
        Integer[] actual1 = new Integer[]{1, 2, 3};
        Integer[] actual2 = new Integer[]{};

        Assertion.assertThat(actual1).isNotEmpty();
        Assertion.assertThat(actual2).isEmpty();
        Assertion.assertThat(actual2).isNullOrEmpty();
        Assertion.assertThat(actual1).contains(1);
        Assertion.assertThat(actual1).doesNotContain(5);
        Assertion.assertThat(actual1).containsAll(1, 2);
        Assertion.assertThat(actual1).containsAll(1, 2, 3);
        Assertion.assertThat(actual1).allMatch(it -> Arrays.equals(it, actual1));
        Assertion.assertThat(actual1).noneMatch(it -> Arrays.equals(it, actual2));
        Assertion.assertThat(new Integer[]{null, 1, 2}).containsNull();
        Assertion.assertThat(actual1).doesNotContainNull();
        Assertion.assertThat(actual1).containsAny(2, 3);

        Double[] actual3 = new Double[]{1.1, 1.2, 1.3};
        Double[] actual4 = new Double[]{};

        Assertion.assertThat(actual3).isNotEmpty();
        Assertion.assertThat(actual4).isEmpty();
        Assertion.assertThat(actual4).isNullOrEmpty();
        Assertion.assertThat(actual3).contains(1.1);
        Assertion.assertThat(actual3).doesNotContain(1.4);
        Assertion.assertThat(actual3).containsAll(1.1, 1.2);
        Assertion.assertThat(actual3).containsAll(1.1, 1.2, 1.3);
        Assertion.assertThat(actual3).allMatch(it -> Arrays.equals(it, actual3));
        Assertion.assertThat(actual3).noneMatch(it -> Arrays.equals(it, actual4));
        Assertion.assertThat(new Double[]{null, 1.1, 2.1}).containsNull();
        Assertion.assertThat(actual3).doesNotContainNull();
        Assertion.assertThat(actual3).containsAny(1.1, 3.2);

        Long[] actual5 = new Long[]{1L, 2L, 3L};
        Long[] actual6 = new Long[]{};

        Assertion.assertThat(actual5).isNotEmpty();
        Assertion.assertThat(actual6).isEmpty();
        Assertion.assertThat(actual6).isNullOrEmpty();
        Assertion.assertThat(actual5).contains(1L);
        Assertion.assertThat(actual5).doesNotContain(5L);
        Assertion.assertThat(actual5).containsAll(1L, 2L);
        Assertion.assertThat(actual5).containsAll(1L, 2L, 3L);
        Assertion.assertThat(actual5).allMatch(it -> Arrays.equals(it, actual5));
        Assertion.assertThat(actual5).noneMatch(it -> Arrays.equals(it, actual6));
        Assertion.assertThat(new Long[]{null, 1L, 2L}).containsNull();
        Assertion.assertThat(actual5).doesNotContainNull();
        Assertion.assertThat(actual5).containsAny(1L, 5L, 12L);

        Short[] actual7 = new Short[]{1, 2, 3};
        Short[] actual8 = new Short[]{};

        Assertion.assertThat(actual7).isNotEmpty();
        Assertion.assertThat(actual8).isEmpty();
        Assertion.assertThat(actual8).isNullOrEmpty();
        Assertion.assertThat(actual7).contains((short) 1);
        Assertion.assertThat(actual7).doesNotContain((short) 5);
        Assertion.assertThat(actual7).containsAll((short) 1, (short) 2);
        Assertion.assertThat(actual7).containsAll((short) 1, (short) 2, (short) 3);
        Assertion.assertThat(actual7).allMatch(it -> Arrays.equals(it, actual7));
        Assertion.assertThat(actual7).noneMatch(it -> Arrays.equals(it, actual8));
        Assertion.assertThat(new Short[]{null, (short) 1, (short) 2}).containsNull();
        Assertion.assertThat(actual7).doesNotContainNull();
        Assertion.assertThat(actual7).containsAny(new Short[]{1, 6, 7, 8});

        Float[] actual9 = new Float[]{1.1F, 1.2F, 1.3F};
        Float[] actual10 = new Float[]{};

        Assertion.assertThat(actual9).isNotEmpty();
        Assertion.assertThat(actual10).isEmpty();
        Assertion.assertThat(actual10).isNullOrEmpty();
        Assertion.assertThat(actual9).contains(1.1F);
        Assertion.assertThat(actual9).doesNotContain(5F);
        Assertion.assertThat(actual9).containsAll(1.1F, 1.2F);
        Assertion.assertThat(actual9).containsAll(1.1F, 1.2F, 1.3F);
        Assertion.assertThat(actual9).allMatch(it -> Arrays.equals(it, actual9));
        Assertion.assertThat(actual9).noneMatch(it -> Arrays.equals(it, actual10));
        Assertion.assertThat(new Float[]{null, 1.1F, 2F}).containsNull();
        Assertion.assertThat(actual9).doesNotContainNull();
        Assertion.assertThat(actual9).containsAny(1.1F, 3F, 10F);

        Byte[] actual11 = new Byte[]{1, 2, 3};
        Byte[] actual12 = new Byte[]{};

        Assertion.assertThat(actual11).isNotEmpty();
        Assertion.assertThat(actual12).isEmpty();
        Assertion.assertThat(actual12).isNullOrEmpty();
        Assertion.assertThat(actual11).contains((byte) 1);
        Assertion.assertThat(actual11).doesNotContain((byte) 5);
        Assertion.assertThat(actual11).containsAll((byte) 1, (byte) 2);
        Assertion.assertThat(actual11).containsAll((byte) 1, (byte) 2, (byte) 3);
        Assertion.assertThat(actual11).allMatch(it -> Arrays.equals(it, actual11));
        Assertion.assertThat(actual11).noneMatch(it -> Arrays.equals(it, actual12));
        Assertion.assertThat(new Byte[]{null, (byte) 1, (byte) 2}).containsNull();
        Assertion.assertThat(actual11).doesNotContainNull();
        Assertion.assertThat(actual11).containsAny((byte) 1.1, (byte) 1, (byte) 'a');

    }
}