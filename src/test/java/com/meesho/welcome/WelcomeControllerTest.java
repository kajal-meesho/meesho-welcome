package com.meesho.welcome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WelcomeControllerTest {

    private final WelcomeController controller = new WelcomeController();

    @Test
    void welcomePageContainsBrandName() {
        String html = controller.welcome();
        assertNotNull(html);
        assertTrue(html.contains("Meesho"), "welcome page should mention Meesho");
    }

    @Test
    void welcomePageHasCallToAction() {
        String html = controller.welcome();
        assertTrue(html.contains("Start shopping"), "welcome page should have a CTA");
    }

    @Test
    void healthEndpointReturnsUp() {
        String json = controller.health();
        assertTrue(json.contains("UP"), "health endpoint should report UP");
    }
}
