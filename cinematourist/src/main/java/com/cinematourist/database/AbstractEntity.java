package com.cinematourist.database;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AbstractEntity implements Entity {

    @Id
    @GeneratedValue
    @Column(name = "ID", columnDefinition = "BINARY(16) NOT NULL", unique = true)
    @Getter
    private UUID id;

    @Basic
    @CreatedDate
    @Column(name = "CREATED_AT", nullable = false, insertable = true, updatable = false, columnDefinition = "DATETIME(3) NOT NULL")
    @Getter
    private LocalDateTime createdAt;

    @Basic
    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_AT", nullable = false, insertable = true, updatable = true, columnDefinition = "DATETIME(3) NOT NULL")
    @Getter
    private LocalDateTime lastModifiedAt;

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    @Transient
    public boolean isNew() { return id == null; }
}
