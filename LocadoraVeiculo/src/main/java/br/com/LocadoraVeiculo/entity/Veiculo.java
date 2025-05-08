package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.dto.ListagemVeiculoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;

    private String placa;

    private String cor;

    private BigDecimal valorDiaria;

    public Veiculo(ListagemVeiculoDTO dto) {
            this.cor = dto.cor();
            this.placa = dto.placa();
            this.valorDiaria = dto.valorDiaria();
    }
}
