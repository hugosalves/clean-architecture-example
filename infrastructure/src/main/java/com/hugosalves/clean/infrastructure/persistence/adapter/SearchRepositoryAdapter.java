package com.hugosalves.clean.infrastructure.persistence.adapter;

import com.hugosalves.clean.application.repository.SearchRepository;
import com.hugosalves.clean.domain.model.Search;
import com.hugosalves.clean.infrastructure.persistence.entity.SearchJpaEntity;
import com.hugosalves.clean.infrastructure.persistence.mapper.SearchMapper;
import com.hugosalves.clean.infrastructure.persistence.repository.SearchJpaRepository;

import java.util.Optional;

public class SearchRepositoryAdapter implements SearchRepository {
    private final SearchJpaRepository searchJpaRepository;
    private final SearchMapper searchMapper;

    public SearchRepositoryAdapter(SearchJpaRepository searchJpaRepository, SearchMapper searchMapper) {
        this.searchJpaRepository = searchJpaRepository;
        this.searchMapper = searchMapper;
    }

    @Override
    public Search save(Search search) {
        SearchJpaEntity jpaEntity = searchMapper.toJpaEntity(search);
        SearchJpaEntity savedEntity = searchJpaRepository.save(jpaEntity);
        return searchMapper.toDomainEntity(savedEntity);
    }

    @Override
    public Optional<Search> findById(Long searchId) {
        Optional<SearchJpaEntity> jpaEntity = searchJpaRepository.findById(searchId);
        return jpaEntity.map(searchMapper::toDomainEntity);
    }
}
