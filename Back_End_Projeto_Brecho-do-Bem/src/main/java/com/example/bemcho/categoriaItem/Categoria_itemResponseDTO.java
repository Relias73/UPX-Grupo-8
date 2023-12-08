package com.example.bemcho.categoriaItem;

public record Categoria_itemResponseDTO(Integer id, String nome) {

    public Categoria_itemResponseDTO(Categoria_item categoriaItem){
        this(categoriaItem.getId(), categoriaItem.getNome());}
}
