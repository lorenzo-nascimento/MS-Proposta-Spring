package lorenzo_nascimento.ms_proposta.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PropostaDTO {
    private BigDecimal valorSolicitado;
    private Integer prazoParaPagamento;

}
