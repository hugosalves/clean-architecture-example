package com.hugosalves.clean.application.service;

import com.hugosalves.clean.application.dto.CreateSearch;
import com.hugosalves.clean.application.dto.SearchDto;
import com.hugosalves.clean.application.mapper.SearchDtoMapper;
import com.hugosalves.clean.application.repository.SearchRepository;
import com.hugosalves.clean.domain.model.Search;
import com.hugosalves.clean.domain.model.SearchParameter;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    private final SearchRepository searchRepository;
    private final SearchDtoMapper searchDtoMapper;

    public SearchServiceImpl(SearchRepository searchRepository, SearchDtoMapper searchDtoMapper) {
        this.searchRepository = searchRepository;
        this.searchDtoMapper = searchDtoMapper;
    }

    @Override
    public SearchDto createSearch(CreateSearch createSearch) {
        Search newSearch = Search.createNewSearch(createSearch.searchTitle(), new SearchParameter(createSearch.searchParameter(), createSearch.searchValue()));

        Search savedSearch = searchRepository.save(newSearch);

        return searchDtoMapper.toDto(savedSearch);
    }
}
