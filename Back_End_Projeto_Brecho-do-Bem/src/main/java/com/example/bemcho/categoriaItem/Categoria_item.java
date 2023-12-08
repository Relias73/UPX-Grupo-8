package com.example.bemcho.categoriaItem;

import com.example.bemcho.doador.DoadorRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "categoria_item")
@Entity(name = "categoria_item")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria_item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public Categoria_item(Categoria_itemRequestDTO data){
        this.nome = data.nome();
    }
}
