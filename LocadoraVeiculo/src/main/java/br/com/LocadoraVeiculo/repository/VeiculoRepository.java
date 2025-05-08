package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Veiculo;
import org.hibernate.query.criteria.JpaQueryableCriteria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
