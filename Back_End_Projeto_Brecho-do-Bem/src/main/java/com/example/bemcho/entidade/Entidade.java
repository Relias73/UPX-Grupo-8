package com.example.bemcho.entidade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "entidade")
@Entity(name = "entidade")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Long cnpj;
    private String endereco;
    private String email;
    private Long telefone;

    public Entidade(EntidadeRequestDTO data){
        this.cnpj = data.cnpj();
        this.endereco = data.endereco();
        this.email = data.email();
        this.telefone = data.telefone();
        this.nome = data.nome();
    }
}
