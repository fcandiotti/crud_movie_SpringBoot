package com.github.fcandiotti.pesquisamovie.controller;

import com.github.fcandiotti.pesquisamovie.dto.GameDTO;
import com.github.fcandiotti.pesquisamovie.entities.Game;
import com.github.fcandiotti.pesquisamovie.repositories.GameRepository;
import com.github.fcandiotti.pesquisamovie.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService service;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
