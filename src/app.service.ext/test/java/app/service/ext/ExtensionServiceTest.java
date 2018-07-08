package app.service.ext;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtensionServiceTest {

    private ExtensionService extensionService;

    @BeforeAll
    public void setup() {
        extensionService = new ExtensionService();
    }

    @Test
    public void getExtension() {
        assertEquals(3, extensionService.getExtension(1, 2));
    }
}
