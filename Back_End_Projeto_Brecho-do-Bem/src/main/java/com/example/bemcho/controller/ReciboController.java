package com.example.bemcho.controller;

import com.example.bemcho.recibo.Recibo;
import com.example.bemcho.recibo.ReciboRepository;
import com.example.bemcho.recibo.ReciboRequestDTO;
import com.example.bemcho.recibo.ReciboResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recibo")
public class ReciboController {
    @Autowired
    private ReciboRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveRecibo(@RequestBody ReciboRequestDTO data){
        Recibo recibodata = new Recibo(data);
        repository.save(recibodata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ReciboResponseDTO> getAll(){

        List<ReciboResponseDTO> reciboList = repository.findAll().stream().map(ReciboResponseDTO::new).toList();
        return reciboList;
    }
}
