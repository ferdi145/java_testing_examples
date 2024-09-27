package examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class StarterTest {

    @Test
    void test_fail() {
        assertThat(1).isEqualTo(2);
    }
    
    @Test
    void test_pass() {
        assertThat(1).isEqualTo(1);
    }
}

