package com.hugosalves.clean.domain.model;

import java.util.Objects;

public record SearchId(Long value) {
    public SearchId {
        Objects.requireNonNull(value, "Search ID value cannot be null");
    }

    public static SearchId generate() {
        return new SearchId(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
