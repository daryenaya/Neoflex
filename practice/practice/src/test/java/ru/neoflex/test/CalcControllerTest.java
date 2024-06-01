package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(CalcController.class)
public class CalcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculateSum() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/plus/5/3")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("8"));
    }

    @Test
    public void testCalculateDifference() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/minus/8/3")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("5"));
    }
}
