package com.olabi.olabiflix.repository;

import com.olabi.olabiflix.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {

}
