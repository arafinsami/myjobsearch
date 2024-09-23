package com.myjobsearch.entity;

import lombok.Getter;

@Getter
public enum SponsorshipType {
    YES("Yes"),
    NO("No");

    private final String label;

    SponsorshipType(String label) {
        this.label = label;
    }
}
