package br.com.cristianokraemer.controle_km.config;


import br.com.cristianokraemer.controle_km.model.Motorista;
import br.com.cristianokraemer.controle_km.repository.MotoristaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CargaInicial implements CommandLineRunner {

    private final MotoristaRepository motoristaRepository;

    public CargaInicial(MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }
    @Override
    public void run(String... args){
        if (motoristaRepository.count() == 0) {
            String[] nomes = {"Carlos", "Cristiano", "Luiz Augusto", "Fonsceca"};

            for (String nome : nomes) {
                Motorista motorista = new Motorista();
                motorista.setNome(nome);
                motoristaRepository.save(motorista);
            }
        }
    }
}
