package com.cinematourist.domain.movie;

import com.cinematourist.database.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends EntityRepository<Movie> {
}