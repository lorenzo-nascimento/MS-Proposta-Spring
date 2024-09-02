package lorenzo_nascimento.ms_proposta.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

// RM 88505 - LORENZO BERLOFA PAZIN DO NASCIMENTO
// RM 94106 - Haniel Botelho Barreto

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_proposta")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Valor solicitado é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O valor solicitado deve ser maior que zero")
    private BigDecimal valorSolicitado;

    @NotNull(message = "Prazo para pagamento é obrigatório")
    @Min(value = 1, message = "O prazo para pagamento deve ser no mínimo 1 mês")
    private Integer prazoParaPagamento;

    private boolean aprovado = false;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
