package com.hugosalves.clean.domain.exception;

import com.hugosalves.clean.domain.model.SearchId;

public class SearchNotFoundException extends RuntimeException {

    public SearchNotFoundException(SearchId id) {
        super("Search not found with ID: " + id);
    }
}
