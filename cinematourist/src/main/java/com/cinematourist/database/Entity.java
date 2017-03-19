package com.cinematourist.database;

import org.springframework.data.domain.Persistable;

import java.time.LocalDateTime;
import java.util.UUID;


public interface Entity extends Persistable<UUID> {

    LocalDateTime getCreatedAt();

    LocalDateTime getLastModifiedAt();
}
