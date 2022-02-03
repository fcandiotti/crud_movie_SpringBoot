package com.github.fcandiotti.pesquisamovie.controller;

import com.github.fcandiotti.pesquisamovie.dto.RecordDTO;
import com.github.fcandiotti.pesquisamovie.dto.RecordInsertDTO;
import com.github.fcandiotti.pesquisamovie.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

    @Autowired
    RecordService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
        RecordDTO newDTO = service.insert(dto);
        return ResponseEntity.ok().body(newDTO);
    }
}
