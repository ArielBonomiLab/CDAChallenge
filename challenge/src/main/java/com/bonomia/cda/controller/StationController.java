package com.bonomia.cda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonomia.cda.dto.Station;

@RestController
@RequestMapping("/stations")
public class StationController {
	
	@PutMapping("/{stationId}")
	public ResponseEntity<?> putStation(@PathVariable long stationId, @RequestBody Station station){
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
