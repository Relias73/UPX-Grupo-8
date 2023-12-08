package com.example.bemcho.controller;

import com.example.bemcho.categoriaItem.Categoria_item;
import com.example.bemcho.categoriaItem.Categoria_itemRepository;
import com.example.bemcho.categoriaItem.Categoria_itemRequestDTO;
import com.example.bemcho.categoriaItem.Categoria_itemResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria_item")
public class categoriaController {
    @Autowired
    private Categoria_itemRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCategoria_item(@RequestBody Categoria_itemRequestDTO data){
        Categoria_item categoriaItemdata = new Categoria_item(data);
        repository.save(categoriaItemdata);
        return;

    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Categoria_itemResponseDTO> getAll(){

        List<Categoria_itemResponseDTO> categoriaItemList = repository.findAll().stream().map(Categoria_itemResponseDTO::new).toList();
        return categoriaItemList;
    }
}
