package br.com.cristianokraemer.controle_km.service;

import br.com.cristianokraemer.controle_km.repository.ViagemRepository;
import org.springframework.stereotype.Service;

@Service
public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }
}
