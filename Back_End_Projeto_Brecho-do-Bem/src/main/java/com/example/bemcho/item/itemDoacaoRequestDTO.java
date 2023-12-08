package com.example.bemcho.item;

public record itemDoacaoRequestDTO(
        String nome,
        Integer categoria_id,
        Integer quantidade_item,
        Integer entidade_id) {
}
