package br.newton.ead.poo.u1.banco;

// definição da classe
public class Correntista {
    
    // atributos
    String nome;
    String cpf;
    String dataNasc;
    
    // construtores
    public Correntista(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }    
    
    // acessores e modificadores
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getDataNasc() {
        return dataNasc;
    }
    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    // gerar uma representação String do objeto
    @Override
    public String toString() {
        return "Correntista [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
    }    
}
