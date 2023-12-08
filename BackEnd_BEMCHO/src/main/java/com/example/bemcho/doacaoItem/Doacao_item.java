package com.example.bemcho.doacaoItem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doacao_item")
@Entity(name = "doacao_item")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doacao_item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doacao_id;
    private Integer item_id;

    public Doacao_item(Doacao_itemRequestDTO data){
        this.doacao_id = data.doacao_id();
        this.item_id = data.item_id();
    }
}
