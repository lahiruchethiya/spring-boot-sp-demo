package com.chethiya.springspdemo.repository_writer;

import com.chethiya.springspdemo.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WriterRepository<T extends BaseEntity> extends JpaRepository<T, UUID> {
}
