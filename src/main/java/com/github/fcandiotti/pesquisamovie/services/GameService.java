package com.github.fcandiotti.pesquisamovie.services;

import com.github.fcandiotti.pesquisamovie.dto.GameDTO;
import com.github.fcandiotti.pesquisamovie.entities.Game;
import com.github.fcandiotti.pesquisamovie.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> list = repository.findAll();
        return list.stream().map(GameDTO::new).collect(Collectors.toList());
    }
}
