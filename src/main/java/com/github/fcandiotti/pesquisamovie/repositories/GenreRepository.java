package com.github.fcandiotti.pesquisamovie.repositories;

import com.github.fcandiotti.pesquisamovie.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
