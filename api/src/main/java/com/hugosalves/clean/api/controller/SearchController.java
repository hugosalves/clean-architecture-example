package com.hugosalves.clean.api.controller;

import com.hugosalves.clean.application.dto.CreateSearch;
import com.hugosalves.clean.application.dto.SearchDto;
import com.hugosalves.clean.application.service.SearchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this as a Spring REST Controller
@RequestMapping("/api/v1/searches")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping
    public ResponseEntity<SearchDto> createOrder(@RequestBody CreateSearch createSearch) {
        // 1. Call the application layer
        SearchDto responseDto = searchService.createSearch(createSearch);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
