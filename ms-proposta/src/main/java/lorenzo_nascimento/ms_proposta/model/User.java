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
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "CPF é obrigatório")
    @Column(unique = true)
    private String cpf;

    @NotBlank(message = "Telefone é obrigatório")
    private String telefone;

    @NotNull(message = "Renda é obrigatória")
    @DecimalMin(value = "0.0", inclusive = false, message = "A renda deve ser maior que zero")
    private BigDecimal renda;


}
