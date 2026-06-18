package com.meesho.welcome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void homePageCtaIsNotAffected() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Start Shopping")))
                .andExpect(content().string(containsString("background: #ff4081")))
                .andExpect(content().string(containsString("class=\"cta\"")));
    }

    @Test
    void shopPageBackButtonStyledDarkGreen() throws Exception {
        mockMvc.perform(get("/shop"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("background: #1a7a1a")))
                .andExpect(content().string(containsString("color: #ffffff")))
                .andExpect(content().string(containsString("class=\"back\"")))
                .andExpect(content().string(containsString(">Home Page<")));
    }
}