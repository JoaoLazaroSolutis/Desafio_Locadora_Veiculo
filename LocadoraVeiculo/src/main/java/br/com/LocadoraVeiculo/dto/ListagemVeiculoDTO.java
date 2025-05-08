package br.com.LocadoraVeiculo.dto;

import java.math.BigDecimal;

public record ListagemVeiculoDTO(
        String placa,
        String cor,
        BigDecimal valorDiaria
) {
}
