package com.pasword.reminder.password_reminder.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class AuditEvents {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onPrePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}

