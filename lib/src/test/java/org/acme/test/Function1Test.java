package org.acme.test;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class Function1Test implements WithAssertions {

    private final Random random = new Random(777364573L);

    @Test
    void parallelTests_1_1() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_2() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_3() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_4() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_5() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_6() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_7() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_1_8() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }
}
