package lorenzo_nascimento.ms_proposta.repository;

import lorenzo_nascimento.ms_proposta.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
