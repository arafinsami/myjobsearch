package com.myjobsearch.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    protected Date created;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated;

    @Version
    protected long version;

    @PrePersist
    public void prePersist() {
        this.created = new Date();
        this.lastUpdated = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastUpdated = new Date();
    }
}
