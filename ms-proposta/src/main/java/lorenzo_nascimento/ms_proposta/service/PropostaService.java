package lorenzo_nascimento.ms_proposta.service;

import lorenzo_nascimento.ms_proposta.model.Proposta;
import lorenzo_nascimento.ms_proposta.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    // List all proposals
    public List<Proposta> findAll() {
        return propostaRepository.findAll();
    }

    // Find proposal by ID
    public Optional<Proposta> findById(Long id) {
        return propostaRepository.findById(id);
    }

    // Insert new proposal
    public Proposta insert(Proposta proposta) {
        // Definindo o valor padrão para o campo aprovado como false, conforme a especificação
        proposta.setAprovado(false);
        return propostaRepository.save(proposta);
    }

    // Update proposal
    public Proposta update(Long id, Proposta proposta) {
        Optional<Proposta> existingProposta = propostaRepository.findById(id);
        if (existingProposta.isPresent()) {
            proposta.setId(id); // Garante que o ID é mantido
            return propostaRepository.save(proposta);
        }
        return null;
    }

    // Delete proposal by ID
    public void delete(Long id) {
        propostaRepository.deleteById(id);
    }
}
