package com.bonomia.cda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonomia.cda.dto.Path;

@RestController
@RequestMapping("/paths")
public class PathController {

	@PutMapping("/{pathId}")
	public ResponseEntity<?> putStation(@PathVariable long pathId, @RequestBody Path path) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{sourceId}/{destinationId}")
	public ResponseEntity<?> getShortestPath(@PathVariable long sourceId, @PathVariable long destinationId){
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
