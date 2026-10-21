package br.com.cristianokraemer.controle_km.controller;

import br.com.cristianokraemer.controle_km.repository.MotoristaRepository;
import br.com.cristianokraemer.controle_km.service.ViagemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViagemController {

    private final ViagemService viagemService;
    private final MotoristaRepository motoristaRepository;

    public ViagemController(ViagemService viagemService, MotoristaRepository motoristaRepository) {
        this.viagemService = viagemService;
        this.motoristaRepository = motoristaRepository;
    }

    @GetMapping("/")
    public String paginaInicial(Model model) {
        model.addAttribute("motoristas", motoristaRepository.findAll());
        model.addAttribute("viagemEmAndamento", viagemService.buscarViagemEmAndamento().orElse(null));
        return "index";
    }
}
