package com.hugosalves.clean.infrastructure.persistence.mapper;

import com.hugosalves.clean.domain.model.Search;
import com.hugosalves.clean.domain.model.SearchId;
import com.hugosalves.clean.domain.model.SearchParameter;
import com.hugosalves.clean.domain.model.SearchStatus;
import com.hugosalves.clean.infrastructure.persistence.entity.SearchJpaEntity;
import org.springframework.stereotype.Component;

@Component
public class SearchMapper {
    public SearchJpaEntity toJpaEntity(Search search) {
        return new SearchJpaEntity(
                search.getId().value(),
                search.getSearchTitle(),
                search.getCreateDate(),
                toJpaStatus(search.getSearchStatus())
        );
    }

    public Search toDomainEntity(SearchJpaEntity searchJpaEntity) {
        return Search.hydrate(
                new SearchId(searchJpaEntity.getId()),
                searchJpaEntity.getTitle(),
                new SearchParameter(searchJpaEntity.getSearchParameter(), searchJpaEntity.getSearchValue()),
                searchJpaEntity.getCreationDate(),
                toDomainStatus(searchJpaEntity.getStatus())
        );
    }

    private SearchJpaEntity.SearchStatusJpa toJpaStatus(SearchStatus domainStatus) {
        return SearchJpaEntity.SearchStatusJpa.valueOf(domainStatus.name());
    }

    private SearchStatus toDomainStatus(SearchJpaEntity.SearchStatusJpa jpaStatus) {
        return SearchStatus.valueOf(jpaStatus.name());
    }
}
