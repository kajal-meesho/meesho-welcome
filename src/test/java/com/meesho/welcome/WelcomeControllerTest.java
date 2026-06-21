package com.meesho.welcome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void welcomePageContainsBrandName() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Meesho")));
    }

    @Test
    void welcomePageHasCallToAction() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Start shopping")));
    }

    @Test
    void welcomePageHasDarkBlueBackground() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("background: #003366")));
    }

    @Test
    void welcomePageHasPersonalizedGreeting() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Welcome Guys")));
    }

    @Test
    void shopPageLoads() throws Exception {
        mockMvc.perform(get("/shop"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Shop")));
    }

    @Test
    void healthEndpointReturnsOkJson() throws Exception {
        mockMvc.perform(get("/health"))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json"))
               .andExpect(content().string(containsString("\"status\":\"ok\"")))
               .andExpect(content().string(containsString("\"service\":\"meesho-welcome\"")));
    }

    @Test
    void sellPageLoadsAndContainsHeading() throws Exception {
        mockMvc.perform(get("/sell"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Become a Seller")));
    }

    @Test
    void sellPageContainsBenefitKeyword() throws Exception {
        mockMvc.perform(get("/sell"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("commission")));
    }

    @Test
    void homepageContainsBecomeSellerLink() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(containsString("Become a Seller")));
    }
}