package br.com.cristianokraemer.controle_km.service;

import br.com.cristianokraemer.controle_km.model.Motorista;
import br.com.cristianokraemer.controle_km.model.Viagem;
import br.com.cristianokraemer.controle_km.repository.ViagemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

        Optional<Viagem> ultimaViagem = viagemRepository.findFirstByDataHoraChegadaIsNotNullOrderByDataHoraChegadaDesc();

        Integer kmInicial = 0;
        if (ultimaViagem.isPresent()) {
            kmInicial = ultimaViagem.get().getKmFinal();
        }

        Viagem viagem = new Viagem();
        viagem.setMotorista(motorista);
        viagem.setDataHoraSaida(LocalDateTime.now());
        viagem.setKmInicial(kmInicial);

        return viagemRepository.save(viagem);
    }

    public Viagem finalizarViagem(Integer kmFinal) {
        Optional<Viagem> viagemAberta = viagemRepository.findFirstByKmFinalIsNull();

        if (viagemAberta.isEmpty()) {
            throw new IllegalStateException("Não existe viagem em andamento para finalizar.");
        }

        Viagem viagem = viagemAberta.get();

        if (kmFinal < viagem.getKmInicial()) {
            throw new IllegalArgumentException("O KM final não pode ser menor que o KM inicial.");
        }

        viagem.setKmFinal(kmFinal);
        viagem.setDataHoraChegada(LocalDateTime.now());

        return viagemRepository.save(viagem);
    }
}
