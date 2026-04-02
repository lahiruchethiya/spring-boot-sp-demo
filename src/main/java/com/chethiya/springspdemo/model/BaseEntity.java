package com.chethiya.springspdemo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
    @Column(name = "created")
    protected OffsetDateTime created;
    @Column(name = "modified")
    protected OffsetDateTime modified;
    @Column(name = "version")
    @Version
    protected Integer version;
}
