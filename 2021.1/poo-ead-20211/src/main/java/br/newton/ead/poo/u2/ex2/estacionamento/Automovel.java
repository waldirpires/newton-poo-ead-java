package br.newton.ead.poo.u2.ex2.estacionamento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Automovel {
    
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private float tempoDePermanencia;
    private float valorTotal;

    public Automovel(String placa) {
        this.placa = placa;
        this.entrada = LocalDateTime.now();
    }
    
    public float calcularTempoDePermanencia() {
        
        this.tempoDePermanencia = ChronoUnit.MINUTES.between(entrada, saida) / 60.0f;
        
        return tempoDePermanencia;
    }
    
    public float calcularValorTotal(float valorHora) {
        this.valorTotal = valorHora * tempoDePermanencia;
        
        return this.valorTotal;
    }
    
    
    public String getPlaca() {
        return placa;
    }




    public void setPlaca(String placa) {
        this.placa = placa;
    }




    public LocalDateTime getEntrada() {
        return entrada;
    }




    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }




    public LocalDateTime getSaida() {
        return saida;
    }




    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }




    public float getTempoDePermanencia() {
        return tempoDePermanencia;
    }




    public void setTempoDePermanencia(float tempoDePermanencia) {
        this.tempoDePermanencia = tempoDePermanencia;
    }




    public float getValorTotal() {
        return valorTotal;
    }




    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }




    @Override
    public String toString() {
        return "Automovel [placa=" + placa + ", entrada=" + entrada + ", saida=" + saida + ", tempoDePermanencia="
                + tempoDePermanencia + ", valorTotal=" + valorTotal + "]";
    }
    
    
}
