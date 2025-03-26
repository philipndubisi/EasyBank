package com.philcode.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;
@MappedSuperclass
public class BaseEntity {
    @Column(
            updatable = false
    )
    private LocalDateTime createdAt;
    private String createdBy;
    @Column(insertable = false)
    private LocalDateTime updatedAt;
    private String updatedBy;

}
