package com.hugosalves.clean.domain.model;

import java.time.LocalDate;

public class Search {

    private final SearchId id;
    private final String searchTitle;
    private final SearchParameter searchParameter;
    private LocalDate createDate;
    private SearchStatus searchStatus;

    private Search(SearchId id, String searchTitle, SearchParameter searchParameter) {
        this.id = id;
        this.searchTitle = searchTitle;
        this.searchParameter = searchParameter;
        this.createDate = LocalDate.now();
        this.searchStatus = SearchStatus.CREATED;
    }

    public static Search createNewSearch(String searchTitle, SearchParameter searchParameter) {

        if (searchTitle == null || searchTitle.isBlank()) {
            throw new IllegalArgumentException("Search Title cannot be blank.");
        }
        if (searchParameter.getSearchValue() == null || searchParameter.getSearchValue().isBlank()) {
            throw new IllegalArgumentException("Search value cannot be blank.");
        }
        return new Search(SearchId.generate(), searchTitle, searchParameter);
    }

    public static Search hydrate(SearchId id, String title, SearchParameter searchParameter, LocalDate creationDate, SearchStatus status) {
        Search search = new Search(id, title, searchParameter);
        search.createDate = creationDate;
        search.searchStatus = status;
        return search;
    }

    public Search initiateSearch() {
        this.searchStatus = SearchStatus.IN_PROGRESS;
        return this;
    }

    public void markAsCompleted() {
        if (this.searchStatus == SearchStatus.CREATED) {
            this.searchStatus = SearchStatus.IN_PROGRESS;
        } else {
            throw new IllegalStateException("Search cannot be marked as completed from status: " + this.searchStatus);
        }
    }

    public SearchId getId() {
        return id;
    }

    public String getSearchTitle() {
        return searchTitle;
    }

    public SearchParameter getSearchParameter() {
        return searchParameter;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public SearchStatus getSearchStatus() {
        return searchStatus;
    }
}
