package org.acme.test;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class Function7Test implements WithAssertions {

    private final Random random = new Random(445454545);

    @Test
    void parallelTests_7_1() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_2() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_3() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_4() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_5() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_6() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_7() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_7_8() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }
}
