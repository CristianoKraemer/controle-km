package br.com.cristianokraemer.controle_km.service;

import br.com.cristianokraemer.controle_km.model.Motorista;
import br.com.cristianokraemer.controle_km.model.Viagem;
import br.com.cristianokraemer.controle_km.repository.ViagemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public Viagem iniciarViagem(Motorista motorista) {
        Optional<Viagem> viagemAberta = viagemRepository.findFirstByKmFinalIsNull();

        if (viagemAberta.isPresent()) {
            throw new IllegalStateException("Existe uma viagem em andamento. Informe o KM para finalizá-la antes de iniciar uma nova.");
        }
        return null;
    }
}
