package org.acme.test;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class Function3Test implements WithAssertions {

    private final Random random = new Random(46365436);

    @Test
    void parallelTests_3_1() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_2() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_3() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_4() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_5() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_6() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_7() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }

    @Test
    void parallelTests_3_8() throws Exception {
        Thread.sleep(1_000);
        assertThat(random.nextInt()).isLessThan(Integer.MAX_VALUE);
    }
}
