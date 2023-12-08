package com.example.bemcho.controller;

import com.example.bemcho.item.itemDoacao;
import com.example.bemcho.item.itemDoacaoRepository;
import com.example.bemcho.item.itemDoacaoRequestDTO;
import com.example.bemcho.item.itemDoacaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class itemDoacaoController {

    @Autowired
    private itemDoacaoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveitemDoacao(@RequestBody itemDoacaoRequestDTO data){
        itemDoacao itemdata = new itemDoacao(data);
        repository.save(itemdata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<itemDoacaoResponseDTO> getAll(){

        List<itemDoacaoResponseDTO> itemList = repository.findAll().stream().map(itemDoacaoResponseDTO::new).toList();
        return itemList;
    }
}
