package com.example.bemcho.doador;

public record DoadorResponseDTO(Integer id, String nome, Long cpf, String email, Long telefone, String endereco, String password){

    public DoadorResponseDTO(Doador doador){
        this(doador.getId(), doador.getNome(), doador.getCpf(), doador.getEmail(), doador.getTelefone(), doador.getEndereco(), doador.getPassword());}
}