package br.com.cristianokraemer.controle_km.repository;

import br.com.cristianokraemer.controle_km.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
}
