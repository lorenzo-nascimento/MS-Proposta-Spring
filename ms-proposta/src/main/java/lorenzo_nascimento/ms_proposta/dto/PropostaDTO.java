package lorenzo_nascimento.ms_proposta.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Valor solicitado é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O valor solicitado deve ser maior que zero")
    private BigDecimal valorSolicitado;

    @NotNull(message = "Prazo para pagamento é obrigatório")
    @Min(value = 1, message = "O prazo para pagamento deve ser no mínimo 1 mês")
    private Integer prazoParaPagamento;

    private boolean aprovado = false; // Campo não obrigatório, pode ser configurado pela lógica do serviço

    @NotNull(message = "ID do usuário é obrigatório")
    private Long userId; // ID do usuário associado à proposta, se necessário
}
