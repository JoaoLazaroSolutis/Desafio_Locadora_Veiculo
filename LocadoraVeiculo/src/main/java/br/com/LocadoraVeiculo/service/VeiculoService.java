package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemVeiculoDTO;
import br.com.LocadoraVeiculo.entity.Motorista;
import br.com.LocadoraVeiculo.entity.Veiculo;
import br.com.LocadoraVeiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<ListagemVeiculoDTO> getAllVeiculo() {
        var listaVeiculos = veiculoRepository.findAll();

        if (listaVeiculos.isEmpty()) {
            throw new RuntimeException("Não há veículos!");
        }
        return listToDTO(listaVeiculos);
    }

    public List<ListagemVeiculoDTO> listToDTO(List<Veiculo> veiculo) {
        List<ListagemVeiculoDTO> listaVeiculos = new ArrayList<>();
        veiculo.forEach(v -> listaVeiculos.add(new ListagemVeiculoDTO(v.getPlaca(), v.getCor(), v.getValorDiaria())));

        return listaVeiculos;
    }
}
