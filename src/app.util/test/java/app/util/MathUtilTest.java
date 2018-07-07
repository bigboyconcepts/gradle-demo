package app.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {

    @Test
    public void sum() {
        assertEquals(3, MathUtil.sum(1, 2));
    }
}
