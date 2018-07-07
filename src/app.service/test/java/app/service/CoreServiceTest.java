package app.service;

import app.util.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoreServiceTest {

    @Test
    public void sum() {
        assertEquals(3, MathUtil.sum(1, 2));
    }
}
