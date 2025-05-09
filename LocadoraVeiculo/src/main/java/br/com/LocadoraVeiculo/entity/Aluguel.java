package br.com.LocadoraVeiculo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name = "pessoa_type")
@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Calendar dataPedido;

    private LocalDate dataEntrega;

    private LocalDate dataDevolucao;

    private BigDecimal valorTotal;

}
