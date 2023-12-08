package com.example.bemcho.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "item_doacao")
@Entity(name = "item_doacao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class itemDoacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer categoria_id;
    private Integer quantidade_item;
    private Integer entidade_id;

    public itemDoacao(itemDoacaoRequestDTO data){
        this.categoria_id = data.categoria_id();
        this.entidade_id = data.entidade_id();
        this.quantidade_item = data.quantidade_item();
        this.nome = data.nome();
    }
}
