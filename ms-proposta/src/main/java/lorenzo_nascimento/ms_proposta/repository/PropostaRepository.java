package lorenzo_nascimento.ms_proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lorenzo_nascimento.ms_proposta.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
