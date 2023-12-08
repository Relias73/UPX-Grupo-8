package com.example.bemcho.doacao;

import java.util.Date;

public record DoacaoResponseDTO(Integer id, Date data_doacao, Integer doador_id) {

    public DoacaoResponseDTO(Doacao doacao){
        this(doacao.getId(), doacao.getData_doacao(), doacao.getDoador_id());}
}
