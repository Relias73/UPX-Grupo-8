package com.example.bemcho.recibo;

import java.util.Date;

public record ReciboRequestDTO(Date data, Integer doacao_id, String status_entrega) {
}
