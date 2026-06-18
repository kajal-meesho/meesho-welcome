package com.meesho.welcome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AboutController.class)
class AboutControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void aboutEndpointReturnsServiceMetadata() throws Exception {
        mockMvc.perform(get("/about"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().string(containsString("\"service\":\"meesho-welcome\"")))
                .andExpect(content().string(containsString("\"team\":\"supplier-service\"")))
                .andExpect(content().string(containsString("\"version\":\"1.0.0\"")))
                .andExpect(content().string(containsString("\"description\":\"Meesho welcome page service\"")));
    }
}