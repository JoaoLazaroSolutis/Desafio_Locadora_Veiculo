package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.tipos.Sexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "pessoa_type")
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private String email;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
    }
}
