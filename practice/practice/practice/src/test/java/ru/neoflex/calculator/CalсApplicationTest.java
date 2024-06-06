package ru.neoflex.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSum() throws Exception {
        this.mockMvc.perform(get("/plus/60/25"))
                .andDo(print())
                .andExpect(content().string(containsString("85")));
    }

    @Test
    public void shouldReturnDifference() throws Exception {
        this.mockMvc.perform(get("/minus/30/10"))
                .andDo(print())
                .andExpect(content().string(containsString("20")));
    }
}