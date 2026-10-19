package br.com.cristianokraemer.controle_km.repository;

import br.com.cristianokraemer.controle_km.model.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}

