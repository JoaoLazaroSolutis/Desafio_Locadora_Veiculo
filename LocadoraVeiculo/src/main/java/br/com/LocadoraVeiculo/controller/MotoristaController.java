package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.service.MotoristaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motorista")
public class MotoristaController {

    @Autowired
    private MotoristaService motoristaService;

    @PostMapping
    public ResponseEntity<String> cadastrasrMotorista(@RequestBody @Valid CadastroMotoristaDTO motoristDTO) {
        try{
            motoristaService.saveMotorista(motoristDTO);
            return ResponseEntity.status(201).body("Cadastro de motorista feito com sucesso!");
        } catch (RuntimeException e) {
            return ResponseEntity.status(409).body("Ocorreu um erro ao cadastrar motorista! Já existe um cadastro com esse email!");
        }
    }
}
