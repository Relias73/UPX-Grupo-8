package com.example.bemcho.recibo;

import com.example.bemcho.doacao.DoacaoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "recibo")
@Entity(name = "recibo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date data;
    private Integer doacao_id;
    private String status_entrega;

    public Recibo(ReciboRequestDTO data){
        this.data = data.data();
        this.doacao_id = data.doacao_id();
        this.status_entrega = data.status_entrega();
    }
}
