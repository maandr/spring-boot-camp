package com.cinematourist.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.QueryHint;
import java.util.UUID;

@NoRepositoryBean
public interface EntityRepository<E extends Entity> extends JpaRepository<E, UUID> {

}
