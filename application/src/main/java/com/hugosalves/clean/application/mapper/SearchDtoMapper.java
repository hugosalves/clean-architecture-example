package com.hugosalves.clean.application.mapper;

import com.hugosalves.clean.application.dto.SearchDto;
import com.hugosalves.clean.domain.model.Search;

public class SearchDtoMapper {
    public SearchDto toDto(Search search) {
        return new SearchDto(
                search.getId().value(),
                search.getSearchTitle(),
                search.getSearchParameter().getSearchParameter(),
                search.getSearchParameter().getSearchValue(),
                search.getSearchStatus().name(),
                search.getCreateDate().toString()
        );
    }
}
