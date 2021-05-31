package com.web.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.search.model.PageData;
import com.web.search.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchservice;
	
	@GetMapping(path = "/health")
	public String getHealth(){
		
		return "up";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/search",produces="application/json")
	public ResponseEntity<List<PageData>> searchdocument(@RequestParam(name = "term",required = true)  String searchterm) {
		List<PageData> pagedatalist = searchservice.searchresource(searchterm);
		HttpHeaders responseHeaders = new HttpHeaders();
		
		return new ResponseEntity<>(pagedatalist,responseHeaders,HttpStatus.OK);
		
		
	}
	
	
}
