package org.acme.test;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class Function4Test implements WithAssertions {

    private final Random random = new Random(5347654);

    @Test
    void parallelTests_4_1() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_2() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_3() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_4() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_5() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_6() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_7() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_4_8() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }
}
