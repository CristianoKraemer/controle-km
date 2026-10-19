package br.com.cristianokraemer.controle_km.repository;

import br.com.cristianokraemer.controle_km.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {

    Optional<Viagem>
    findFirstByDataHoraChegadaIsNotNullOrderByDataHoraChegadaDesc();


}
