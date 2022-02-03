package com.github.fcandiotti.pesquisamovie.services;

import com.github.fcandiotti.pesquisamovie.dto.RecordDTO;
import com.github.fcandiotti.pesquisamovie.dto.RecordInsertDTO;
import com.github.fcandiotti.pesquisamovie.entities.Game;
import com.github.fcandiotti.pesquisamovie.entities.Record;
import com.github.fcandiotti.pesquisamovie.repositories.GameRepository;
import com.github.fcandiotti.pesquisamovie.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Game game = gameRepository.getById(dto.getGameId());
        entity.setGame(game);

        entity = repository.save(entity);
        return new RecordDTO(entity);
    }
}
