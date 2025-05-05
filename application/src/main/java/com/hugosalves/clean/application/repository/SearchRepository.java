package com.hugosalves.clean.application.repository;

import com.hugosalves.clean.domain.model.Search;

import java.util.Optional;

public interface SearchRepository {
    Search save(Search search);
    Optional<Search> findById(Long searchId);
}
