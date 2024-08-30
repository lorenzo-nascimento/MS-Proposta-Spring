package lorenzo_nascimento.ms_proposta.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class UserDTO {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private BigDecimal renda;

}
