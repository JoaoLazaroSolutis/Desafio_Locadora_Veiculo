package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.entity.Motorista;
import br.com.LocadoraVeiculo.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Transactional
    public ListagemMotoristaDTO saveMotorista(CadastroMotoristaDTO motoristaDTO) {
        if (motoristaRepository.existsByEmail(motoristaDTO.email())) {
            throw new RuntimeException("Este e-mail já está cadastrado.");
        }
        var motorista = new Motorista(motoristaDTO);
        motoristaRepository.save(motorista);
        return toDTO(motorista);
    }

    public ListagemMotoristaDTO toDTO(Motorista motorista) {
        return new ListagemMotoristaDTO(motorista.getNome(), motorista.getCpf(), motorista.getEmail(), motorista.getNumeroCNH());
    }

}