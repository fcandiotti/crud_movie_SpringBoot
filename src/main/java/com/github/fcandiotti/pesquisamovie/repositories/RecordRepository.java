package com.github.fcandiotti.pesquisamovie.repositories;

import com.github.fcandiotti.pesquisamovie.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
