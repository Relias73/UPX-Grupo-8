package com.example.bemcho.recibo;

import java.util.Date;

public record ReciboResponseDTO(Integer id, Date data,Integer doacao_id, String status_entrega) {
    public ReciboResponseDTO(Recibo recibo){
        this(recibo.getId(), recibo.getData(),recibo.getDoacao_id(), recibo.getStatus_entrega());}
}
