package com.example.bemcho.controller;

import com.example.bemcho.entidade.Entidade;
import com.example.bemcho.entidade.EntidadeRepository;
import com.example.bemcho.entidade.EntidadeRequestDTO;
import com.example.bemcho.entidade.EntidadeResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("entidade")
public class EntidadeController {
    @Autowired
    private EntidadeRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveEntidade(@RequestBody EntidadeRequestDTO data){
        Entidade entidadedata = new Entidade(data);
        repository.save(entidadedata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EntidadeResponseDTO> getAll() {

        List<EntidadeResponseDTO> entidadeList = repository.findAll().stream().map(EntidadeResponseDTO::new).toList();
        return entidadeList;
    }
}
