package com.example.bemcho.doador;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doador")
@Entity(name = "doador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Long cpf;
    private String endereco;
    private String email;
    private Long telefone;
    private String password;

    public Doador(DoadorRequestDTO data){
        this.cpf = data.cpf();
        this.endereco = data.endereco();
        this.email = data.email();
        this.telefone = data.telefone();
        this.nome = data.nome();
        this.password = data.password();
    }
}

