package com.example.bemcho.controller;

import com.example.bemcho.doacao.Doacao;
import com.example.bemcho.doacao.DoacaoRequestDTO;
import com.example.bemcho.doacao.DoacaoResponseDTO;
import com.example.bemcho.doacao.doacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doacao")
public class doacaoController {
    @Autowired
    private doacaoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveDoacao(@RequestBody DoacaoRequestDTO data){
        Doacao doacaodata = new Doacao(data);
        repository.save(doacaodata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DoacaoResponseDTO> getAll(){

        List<DoacaoResponseDTO> doacaoList = repository.findAll().stream().map(DoacaoResponseDTO::new).toList();
        return doacaoList;
    }
}
