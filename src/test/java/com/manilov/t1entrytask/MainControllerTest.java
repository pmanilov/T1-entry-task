package com.manilov.t1entrytask;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manilov.t1entrytask.dto.RequestBodyDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testLettersFrequency() throws Exception {
        RequestBodyDTO requestBody = new RequestBodyDTO();
        requestBody.setText("aaaaabcccc");
        String jsonRequest = objectMapper.writeValueAsString(requestBody);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/frequency")
                        .content(jsonRequest)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.a").value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("$.c").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$.b").value(1));
    }
}