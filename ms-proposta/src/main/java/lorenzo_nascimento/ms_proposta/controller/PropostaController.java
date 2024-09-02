package lorenzo_nascimento.ms_proposta.controller;

import lorenzo_nascimento.ms_proposta.dto.PropostaDTO;
import lorenzo_nascimento.ms_proposta.model.Proposta;
import lorenzo_nascimento.ms_proposta.service.PropostaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/propostas")
public class PropostaController {

    @Autowired
    private PropostaService propostaService;

    @Autowired
    private ModelMapper modelMapper;

    // Get all proposals
    @GetMapping
    public ResponseEntity<List<PropostaDTO>> findAll() {
        List<PropostaDTO> propostas = propostaService.findAll().stream()
                .map(proposta -> modelMapper.map(proposta, PropostaDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(propostas);
    }

    // Get proposal by ID
    @GetMapping("/{id}")
    public ResponseEntity<PropostaDTO> findById(@PathVariable Long id) {
        Optional<Proposta> proposta = propostaService.findById(id);
        if (proposta.isPresent()) {
            PropostaDTO propostaDTO = modelMapper.map(proposta.get(), PropostaDTO.class);
            return ResponseEntity.ok(propostaDTO);
        }
        return ResponseEntity.notFound().build();
    }

    // Insert new proposal
    @PostMapping
    public ResponseEntity<PropostaDTO> insert(@RequestBody PropostaDTO propostaDTO) {
        Proposta proposta = modelMapper.map(propostaDTO, Proposta.class);
        proposta = propostaService.insert(proposta);
        PropostaDTO savedPropostaDTO = modelMapper.map(proposta, PropostaDTO.class);
        return ResponseEntity.ok(savedPropostaDTO);
    }

    // Update proposal
    @PutMapping("/{id}")
    public ResponseEntity<PropostaDTO> update(@PathVariable Long id, @RequestBody PropostaDTO propostaDTO) {
        Proposta proposta = modelMapper.map(propostaDTO, Proposta.class);
        Proposta updatedProposta = propostaService.update(id, proposta);
        if (updatedProposta != null) {
            PropostaDTO updatedPropostaDTO = modelMapper.map(updatedProposta, PropostaDTO.class);
            return ResponseEntity.ok(updatedPropostaDTO);
        }
        return ResponseEntity.notFound().build();
    }

    // Delete proposal by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        propostaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

