package com.hugosalves.clean.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "searches")
public class SearchJpaEntity {

    @Id
    private Long id; // Matches domain OrderId type

    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private String searchParameter;

    @Column(nullable = false)
    private String searchValue;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING) // Store enum name as string
    private SearchStatusJpa status;

    public enum SearchStatusJpa {CREATED, IN_PROGRESS, COMPLETED, FAILED}

    public SearchJpaEntity(Long id, String title, LocalDate creationDate, SearchStatusJpa status) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getSearchParameter() { return searchParameter; }
    public String getSearchValue() { return searchValue; }
    public LocalDate getCreationDate() { return creationDate; }
    public SearchStatusJpa getStatus() { return status; }
}
