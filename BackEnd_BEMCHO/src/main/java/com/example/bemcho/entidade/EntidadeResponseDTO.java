package com.example.bemcho.entidade;

public record EntidadeResponseDTO(Integer id, String nome, Long cnpj, String email, Long telefone, String endereco) {
    public EntidadeResponseDTO(Entidade entidadeReceptora){
        this(entidadeReceptora.getId(), entidadeReceptora.getNome(), entidadeReceptora.getCnpj(), entidadeReceptora.getEmail(), entidadeReceptora.getTelefone(), entidadeReceptora.getEndereco());}
}
