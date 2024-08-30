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

import com.bonomia.cda.dto.Station;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class StationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testUpdateStation() throws Exception {
        
        String stationId = "1";
        String updatedName = "Updated Station Name";
        Station updatedStation = new Station();
        updatedStation.setName(updatedName);

        mockMvc.perform(put("/stations/{id}", stationId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedStation)))
                .andExpect(status().isOk());

        mockMvc.perform(get("/stations/{id}", stationId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value(updatedName));

        mockMvc.perform(delete("/stations/{id}", stationId))
                .andExpect(status().isNoContent());
    
    }
}