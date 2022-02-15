package com.example.webfluxv2;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToDo {
    @Id
    String id;
    String description;
    LocalDateTime created;
    LocalDateTime modified;
    boolean completed;

    public ToDo() {
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }

    public ToDo(String description,
                boolean completed) {
        this();
        this.description = description;
        this.completed = completed;
    }
}
