package com.hugosalves.clean.domain.model;

public enum SearchStatus {
    CREATED,
    IN_PROGRESS,
    COMPLETED,
    FAILED;

    public boolean isCompleted() {
        return this == COMPLETED;
    }

    public boolean isFailed() {
        return this == FAILED;
    }

    public boolean isInProgress() {
        return this == IN_PROGRESS;
    }

    public boolean isCreated() {
        return this == CREATED;
    }
}
