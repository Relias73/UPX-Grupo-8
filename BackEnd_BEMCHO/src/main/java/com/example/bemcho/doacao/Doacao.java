package com.example.bemcho.doacao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "doacao")
@Entity(name = "doacao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date data_doacao;
    private Integer doador_id;

    public Doacao(DoacaoRequestDTO data){
        this.data_doacao = data.data_doacao();
        this.doador_id = data.doador_id();
    }
}
