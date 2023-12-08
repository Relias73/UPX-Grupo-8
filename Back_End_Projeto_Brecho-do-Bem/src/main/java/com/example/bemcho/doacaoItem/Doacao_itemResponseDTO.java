package com.example.bemcho.doacaoItem;

public record Doacao_itemResponseDTO(Integer doacao_id, Integer item_id) {
    public Doacao_itemResponseDTO(Doacao_item doacaoItem){
        this(doacaoItem.getDoacao_id(), doacaoItem.getItem_id());}
}
