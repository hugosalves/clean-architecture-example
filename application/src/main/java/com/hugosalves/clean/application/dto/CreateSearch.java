package com.hugosalves.clean.application.dto;

public record CreateSearch(
        String searchTitle,
        String searchParameter,
        String searchValue
) {
    public CreateSearch {
        if (searchTitle == null || searchTitle.isBlank()) {
            throw new IllegalArgumentException("Search title cannot be null or blank");
        }
        if (searchParameter == null || searchParameter.isBlank()) {
            throw new IllegalArgumentException("Search parameter cannot be null or blank");
        }
        if (searchValue == null || searchValue.isBlank()) {
            throw new IllegalArgumentException("Search value cannot be null or blank");
        }
    }
}
