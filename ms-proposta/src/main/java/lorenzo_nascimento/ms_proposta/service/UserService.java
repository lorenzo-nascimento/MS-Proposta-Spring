package lorenzo_nascimento.ms_proposta.service;

import lorenzo_nascimento.ms_proposta.model.User;
import lorenzo_nascimento.ms_proposta.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Find all users
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Find user by ID
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    // Insert new user
    public User insert(User user) {
        return userRepository.save(user);
    }

    // Update user
    public User update(Long id, User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User userToUpdate = existingUser.get();
            userToUpdate.setNome(user.getNome());
            userToUpdate.setSobrenome(user.getSobrenome());
            userToUpdate.setCpf(user.getCpf());
            userToUpdate.setTelefone(user.getTelefone());
            userToUpdate.setRenda(user.getRenda());
            return userRepository.save(userToUpdate);
        }
        return null; // Ou lançar uma exceção
    }

    // Delete user by ID
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
