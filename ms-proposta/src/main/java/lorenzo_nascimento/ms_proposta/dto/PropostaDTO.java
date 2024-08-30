package lorenzo_nascimento.ms_proposta.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class PropostaDTO {
    private BigDecimal valorSolicitado;
    private Integer prazoParaPagamento;

}
