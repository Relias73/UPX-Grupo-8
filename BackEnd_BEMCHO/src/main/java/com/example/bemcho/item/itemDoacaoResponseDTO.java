package com.example.bemcho.item;
public record itemDoacaoResponseDTO(Integer id, String nome, Integer categoria_id, Integer quantidade_item, Integer entidade_id){
    public itemDoacaoResponseDTO(itemDoacao item){
        this(item.getId(), item.getNome(), item.getQuantidade_item(), item.getCategoria_id(), item.getEntidade_id());
    }
}
