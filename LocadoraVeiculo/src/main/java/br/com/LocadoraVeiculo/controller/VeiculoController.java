package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.ListagemVeiculoDTO;
import br.com.LocadoraVeiculo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoservice;

    @GetMapping
    public ResponseEntity<List<ListagemVeiculoDTO>> getAllVeiculos() {
        try {
            return ResponseEntity.ok(veiculoservice.getAllVeiculo());
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build();
        }
    }
}
