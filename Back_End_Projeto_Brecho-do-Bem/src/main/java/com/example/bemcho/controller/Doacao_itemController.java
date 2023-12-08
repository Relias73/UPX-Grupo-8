package com.example.bemcho.controller;

import com.example.bemcho.doacaoItem.Doacao_item;
import com.example.bemcho.doacaoItem.Doacao_itemRepository;
import com.example.bemcho.doacaoItem.Doacao_itemRequestDTO;
import com.example.bemcho.doacaoItem.Doacao_itemResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doacao_item")
public class Doacao_itemController {
    @Autowired
    private Doacao_itemRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveDoacao_item(@RequestBody Doacao_itemRequestDTO data){
        Doacao_item doacaoItemdata = new Doacao_item(data);
        repository.save(doacaoItemdata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Doacao_itemResponseDTO> getAll(){

        List<Doacao_itemResponseDTO> doacaoItemList = repository.findAll().stream().map(Doacao_itemResponseDTO::new).toList();
        return doacaoItemList;
    }
}
