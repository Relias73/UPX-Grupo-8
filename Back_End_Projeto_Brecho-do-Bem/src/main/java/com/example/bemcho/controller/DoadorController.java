package com.example.bemcho.controller;

import com.example.bemcho.doador.Doador;
import com.example.bemcho.doador.DoadorRepository;
import com.example.bemcho.doador.DoadorRequestDTO;
import com.example.bemcho.doador.DoadorResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doador")
public class DoadorController {
    @Autowired
    private DoadorRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveDoador(@RequestBody DoadorRequestDTO data){
        Doador doadordata = new Doador(data);
        repository.save(doadordata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<DoadorResponseDTO> getAll(){

        List<DoadorResponseDTO> doadorList = repository.findAll().stream().map(DoadorResponseDTO::new).toList();
        return doadorList;
    }
}
