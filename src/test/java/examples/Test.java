package examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;


class MockSpec {

    @Test
    void mockDirectCall() {
        assertThat(1).isEqualTo(2);
    }
}

