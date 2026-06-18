package com.meesho.welcome;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Serves service metadata at GET /about.
 */
@RestController
public class AboutController {

    @GetMapping(value = "/about", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> about() {
        return Map.of(
                "service", "meesho-welcome",
                "team", "supplier-service",
                "version", "1.0.0",
                "description", "Meesho welcome page service"
        );
    }
}