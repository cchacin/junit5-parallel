package org.acme.test;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class Function8Test implements WithAssertions {

    private final Random random = new Random(878787878);

    @Test
    void parallelTests_8_1() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_2() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_3() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_4() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_5() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_6() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_7() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_8_8() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }
}
