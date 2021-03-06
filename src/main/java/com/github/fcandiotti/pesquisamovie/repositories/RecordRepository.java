package com.github.fcandiotti.pesquisamovie.repositories;

import com.github.fcandiotti.pesquisamovie.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.Instant;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query("SELECT obj FROM Record obj WHERE "
            + "(:minDate IS NULL OR obj.moment >= :minDate) AND "
            + "(:maxDate IS NULL OR obj.moment <= :maxDate)")
    Page<Record> findByMoments(Instant minDate, Instant maxDate, Pageable pageable);
}
