package com.github.fcandiotti.pesquisamovie.repositories;

import com.github.fcandiotti.pesquisamovie.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
