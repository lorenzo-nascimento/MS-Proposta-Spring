package lorenzo_nascimento.ms_proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lorenzo_nascimento.ms_proposta.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
