package com.bonomia.cda.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.bonomia.cda.dto.Path;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class PathControllerTest {
	
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testUpdatePath() throws Exception {
        String pathId = "1"; 
        Path updatedPath = new Path();
        updatedPath.setCost(15.5);
        updatedPath.setSourceId(101);
        updatedPath.setDestinationId(202);

       
        mockMvc.perform(put("/paths/{id}", pathId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedPath)))
                .andExpect(status().isOk());

       
        mockMvc.perform(get("/paths/{id}", pathId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.cost").value(15.5))
                .andExpect(jsonPath("$.source_id").value(101))
                .andExpect(jsonPath("$.destination_id").value(202));

       
        mockMvc.perform(delete("/paths/{id}", pathId))
                .andExpect(status().isNoContent());
    }

}
