package com.hugosalves.clean.domain.model;

public class SearchParameter {
    private final String searchParameter;
    private final String searchValue;

    public SearchParameter(String searchParameter, String searchValue) {
        this.searchParameter = searchParameter;
        this.searchValue = searchValue;
    }

    public String getSearchParameter() {
        return searchParameter;
    }

    public String getSearchValue() {
        return searchValue;
    }
}
