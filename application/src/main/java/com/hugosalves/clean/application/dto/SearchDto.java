package com.hugosalves.clean.application.dto;

public record SearchDto (
        Long id,
        String searchTitle,
        String searchParameter,
        String searchValue,
        String status,
        String createdAt
) {
    public SearchDto {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID must be a positive number");
        }
    }
}
