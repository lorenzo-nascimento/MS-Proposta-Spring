package lorenzo_nascimento.ms_proposta.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
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
public class UserDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "CPF é obrigatório")
    // Adicione uma validação de formato para CPF, se necessário
    private String cpf;

    @NotBlank(message = "Telefone é obrigatório")
    // Adicione uma validação de formato para telefone, se necessário
    private String telefone;

    @NotNull(message = "Renda é obrigatória")
    @DecimalMin(value = "0.0", inclusive = false, message = "A renda deve ser maior que zero")
    private BigDecimal renda;
}
