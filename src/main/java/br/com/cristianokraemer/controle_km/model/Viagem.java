package br.com.cristianokraemer.controle_km.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Motorista motorista;

    private LocalDateTime dataHoraSaida;
    private Integer kmInicial;
    private LocalDateTime dataHoraChegada;
    private Integer kmFinal;
    private String destino;
    private Boolean abasteceu;
    private BigDecimal valorAbastecimento;
    private String postoAbastecimento;


    public Viagem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Integer getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    public LocalDateTime getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Integer kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Boolean getAbasteceu() {
        return abasteceu;
    }

    public void setAbasteceu(Boolean abasteceu) {
        this.abasteceu = abasteceu;
    }

    public BigDecimal getValorAbastecimento() {
        return valorAbastecimento;
    }

    public void setValorAbastecimento(BigDecimal valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public String getPostoAbastecimento() {
        return postoAbastecimento;
    }

    public void setPostoAbastecimento(String postoAbastecimento) {
        this.postoAbastecimento = postoAbastecimento;
    }
}
