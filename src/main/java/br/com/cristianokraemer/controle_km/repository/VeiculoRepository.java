package br.com.cristianokraemer.controle_km.repository;

import br.com.cristianokraemer.controle_km.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
