package com.myjobsearch.entity;

import lombok.Getter;

@Getter
public enum IndustryType {
    TECHNOLOGY("Technology"),
    FINANCE("Finance"),
    HEALTHCARE("Health care"),
    EDUCATION("Education"),
    OTHER("Others");

    private final String label;

    IndustryType(String label) {
        this.label = label;
    }
}
