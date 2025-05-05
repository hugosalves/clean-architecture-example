package com.hugosalves.clean.infrastructure.persistence.repository;

import com.hugosalves.clean.infrastructure.persistence.entity.SearchJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchJpaRepository extends JpaRepository<SearchJpaEntity, Long> {

}
