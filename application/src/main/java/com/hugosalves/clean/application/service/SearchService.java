package com.hugosalves.clean.application.service;

import com.hugosalves.clean.application.dto.CreateSearch;
import com.hugosalves.clean.application.dto.SearchDto;

public interface SearchService {
    SearchDto createSearch(CreateSearch createSearch);
}
