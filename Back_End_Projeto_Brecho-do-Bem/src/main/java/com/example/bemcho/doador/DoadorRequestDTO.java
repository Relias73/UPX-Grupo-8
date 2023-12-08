package com.example.bemcho.doador;

public record DoadorRequestDTO(String nome, Long cpf, String email, Long telefone, String endereco, String password) {
}
