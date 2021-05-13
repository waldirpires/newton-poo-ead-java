package br.newton.ead.poo.u2.ex2.estacionamento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private String nome;
    private float valorHora;
    private int capacidade;
    
    private List<Automovel> automoveis; // automoveis estacionados

    public Estacionamento(String nome, float valorHora, int capacidade) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.capacidade = capacidade;
        
        this.automoveis = new ArrayList<Automovel>();
    }
    
    private Automovel pesquisar(String placa) {
        for (var auto: automoveis) {
            if (auto.getPlaca().equalsIgnoreCase(placa)) {
                return auto;
            }
        }
        
        return null;
    }
    
    public void realizarEntrada(String placa) {
        // verificar se o automovel já existe
        if (pesquisar(placa) != null) {
            System.out.println("INFO: Placa já existe: " + placa + "\n");
            
            return;
        }
        
        var auto = new Automovel(placa);
        this.automoveis.add(auto);
        System.out.println("INFO: automovel inserido com sucesso: " + placa + "\n");        
    }
    
    public void realizarSaida(String placa, LocalDateTime saida) {
        // verificar se o automovel ainda estah
        var auto = pesquisar(placa);
        if (auto == null) {
            System.out.println("ERRO: automovel não existe - " + placa + "\n");
            
            return;
        }
        
        auto.setSaida(saida);
        auto.calcularTempoDePermanencia();
        auto.calcularValorTotal(valorHora);
        
        System.out.println(auto);
        System.out.println("\nValor total a ser pago: " + auto.getValorTotal() + "\n\n"); 
        this.automoveis.remove(auto);
    }
    
    public float calcularTaxaDeOcupacao() {
        return automoveis.size() / (capacidade + 1.0f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(List<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    @Override
    public String toString() {
        return "Estacionamento [nome=" + nome + ", valorHora=" + valorHora + ", capacidade=" + capacidade
                + ", automoveis=" + automoveis + "]";
    }
    
}
