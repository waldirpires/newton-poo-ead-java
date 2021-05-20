package br.newton.ead.poo.u3.ex1.figura;

public abstract class Figura {

    private String nome;

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public Figura(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Figura [nome=" + nome + "]";
    }

}
