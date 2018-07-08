package app.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {

    private MathService mathService;

    @BeforeAll
    public void setup() {
        mathService = new MathService();
    }

    @Test
    public void sum() {
        assertEquals(3, mathService.sum(1, 2));
    }

    @Test
    public void multiply() {
        assertEquals(6, mathService.multiply(2, 3));
    }
}
